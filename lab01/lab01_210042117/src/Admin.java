class Admin extends User {

    public Admin(String name, String email, String phone) {
        super(name, email, phone);
    }

    public void manageDriver(Driver driver) {
        // manage the driver
    }

    public void manageRider(Rider rider) {
        // manage the rider
    }

    public void viewTripHistory (Trip trip) {
        // view the trip history
    }
}