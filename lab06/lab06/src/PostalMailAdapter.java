public class PostalMailAdapter implements Notification {
    private ThirdPartyPostalMail postalMail;

    public PostalMailAdapter(ThirdPartyPostalMail postalMail) {
        this.postalMail = postalMail;
    }

    @Override
    public void send(String receiver, String message, Location location) {
        String subject = "Notification"; // Default subject
        String senderName = "System"; // Default sender name
        postalMail.sendPostalMail(receiver, location.toString(), subject, message, senderName);
    }
}