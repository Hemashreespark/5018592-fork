package adapterpackage;


public class Test {

    public static void main(String[] args) {
        Razorpay razorPay = new Razorpay();
        Upi upi = new Upi();

        PaymentProcessor RazorPayAdapter = new RazorPayAdapter(razorPay);
        PaymentProcessor UpiAdapter = new UpiAdapter(upi);

        RazorPayAdapter.processPayment(100.0);
        UpiAdapter.processPayment(200.0);
    
    }
}

