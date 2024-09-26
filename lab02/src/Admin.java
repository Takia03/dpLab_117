class Admin extends User {

    private NotificationService notificationService;

    public Admin(String name, String email, String phone, NotificationService notificationService)
    {
        super(name, email, phone);
        this.notificationService = notificationService;
    }

    public void notifyDriver(Driver driver, String message){
        notificationService.sendNotification(message);
    }

    public void notifyRider(Rider rider, String message){
        notificationService.sendNotification(message);
    }

}