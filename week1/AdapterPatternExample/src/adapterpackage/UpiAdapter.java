package adapterpackage;

public class UpiAdapter implements PaymentProcessor {
    private Upi upi;

    public UpiAdapter(Upi upi) {
        this.upi = upi;
    }

    @Override
    public void processPayment(double amount) {
        upi.makePayment(amount);
    }
}

