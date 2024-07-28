package adapterpackage;

public class RazorPayAdapter implements PaymentProcessor {
    private Razorpay razorPay;

    public RazorPayAdapter(Razorpay razorPay) {
        this.razorPay = razorPay;
    }

    @Override
    public void processPayment(double amount) {
    	razorPay.sendPayment(amount);
    }
}