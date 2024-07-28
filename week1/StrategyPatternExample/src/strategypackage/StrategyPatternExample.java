package strategypackage;

public class StrategyPatternExample {

    // Strategy Interface
    interface PaymentStrategy {
        void pay(double amount);
    }

    // Concrete Strategy for Credit Card Payment
    static class CreditCardPayment implements PaymentStrategy {
        private String cardNumber;
        private String cardHolder;
        private String cvv;
        private String expiryDate;

        public CreditCardPayment(String cardNumber, String cardHolder, String cvv, String expiryDate) {
            this.cardNumber = cardNumber;
            this.cardHolder = cardHolder;
            this.cvv = cvv;
            this.expiryDate = expiryDate;
        }

        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
        }
    }

    // Concrete Strategy for PayPal Payment
    static class PayPalPayment implements PaymentStrategy {
        private String email;
        private String password;

        public PayPalPayment(String email, String password) {
            this.email = email;
            this.password = password;
        }

        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal.");
        }
    }

    // Context Class
    static class PaymentContext {
        private PaymentStrategy paymentStrategy;

        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void executePayment(double amount) {
            if (paymentStrategy != null) {
                paymentStrategy.pay(amount);
            } else {
                System.out.println("No payment strategy set.");
            }
        }
    }

    // Main Method for Testing
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Use Credit Card Payment Strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(250.0);

        // Use PayPal Payment Strategy
        PaymentStrategy payPalPayment = new PayPalPayment("john@example.com", "password123");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(150.0);
    }
}
