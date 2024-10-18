public class SMSNotification implements Notification{

    public void send(String receiver, String message, Location location) {
        System.out.println("SMS sent to " + receiver + " with Message=" + message+" from "+location);
    }
}
