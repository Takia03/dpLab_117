public class Rider extends User{

    private PaymentMethod preferredPaymentMethod;
    public  Rider(String id, String name, String rating, PaymentMethod preferredPaymentMethod){
        super(id, name, rating);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod (PaymentMethod preferredPaymentMethod){
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void requestRide(){
       // request a ride
    }

    public void rateDriver(Driver driver, int rating){
        // rate the driver
    }

    public void makePayment(double amount){
        preferredPaymentMethod.processPayment(amount);
    }
}
