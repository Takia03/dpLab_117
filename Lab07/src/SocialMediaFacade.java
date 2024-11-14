import java.util.ArrayList;
import java.util.List;

public class SocialMediaFacade {
    private List<INotification> notificationServices = new ArrayList<>();

    public SocialMediaFacade() {
        // Initialize adapters for each platform
        notificationServices.add(new TwitterAdapter(new Twitter()));
        notificationServices.add(new FacebookAdapter(new Facebook()));
        // More platforms can be added here easily
    }

    public List<String> getAllNotifications() {
        List<String> allNotifications = new ArrayList<>();
        for (INotification service : notificationServices) {
            allNotifications.addAll(service.getNotifications());
        }
        return allNotifications;
    }

    public void markNotificationAsRead(String notificationID) {
        for (INotification service : notificationServices) {
            service.markAsRead(notificationID);
        }
    }

    public void deleteNotification(String notificationID) {
        for (INotification service : notificationServices) {
            service.deleteNotification(notificationID);
        }
    }
}
