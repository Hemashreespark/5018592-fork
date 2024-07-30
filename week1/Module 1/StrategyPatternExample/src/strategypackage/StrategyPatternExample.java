package strategypackage;

public class StrategyPatternExample {

    interface PaymentStrategy {
        void pay(double amount);
    }

    // Concrete Strategy 
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

        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
        }
    }

    // Concrete Strategy
    static class PayPalPayment implements PaymentStrategy {
        private String email;
        private String password;

        public PayPalPayment(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal.");
        }
    }

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
