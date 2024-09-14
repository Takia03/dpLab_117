public class Trip {
    private String id;
    private String pickupLocation;
    private String dropoffLocation;
    private String rideType;
    private String status;
    private double fare;
    private double distance;


    public Trip(String id, String pickupLocation, String dropoffLocation, String rideType, String status, double fare, double distance) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.rideType = rideType;
        this.status = status;
        this.fare = fare;
        this.distance = distance;
    }

    public void calculateFare(){
        // calculate the fare
    }

    public void assignDriver(Driver driver){
        // assign a driver
    }

    public void completeTrip(){
        // complete the trip
    }


}
