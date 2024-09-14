public class Rider extends User{

    public  String preferredPaymentMethod;
    public  Rider(String id, String name, String rating, String preferredPaymentMethod){
        super(id, name, rating);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void requestRide(){
       // request a ride
    }

    public void rateDriver(Driver driver, int rating){
        // rate the driver
    }

    public void makePayment(double amount){
        // make payment
    }
}
