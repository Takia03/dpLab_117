// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Location dhaka = new Location("Dhaka", "Bangladesh");
        Location chittagong = new Location("Chittagong", "Bangladesh");
        Location khulna = new Location("Khulna", "Bangladesh");

        // Existing notification methods
        Notification emailNotification = new EmailNotification();
        emailNotification.send("takia", "Welcome to our service!", dhaka);

        Notification smsNotification = new SMSNotification();
        smsNotification.send("takia", "Your OTP is 1234", chittagong);

        // New 3rd party system integrated using the adapter
        ThirdPartyPostalMail thirdPartyPostalMail = new ThirdPartyPostalMail();
        Notification postalMailNotification = new PostalMailAdapter(thirdPartyPostalMail);
        postalMailNotification.send("takia", "Your package has been shipped.", khulna);
    }
}