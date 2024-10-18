public class EmailNotification implements Notification{
    public void send(String receiver, String message,Location location) {
        System.out.println("Email sent to " + receiver + " with Message=" + message+" from "+location);
    }


}
