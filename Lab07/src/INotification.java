import java.util.List;

public interface INotification {
    List<String> getNotifications();
    void markAsRead(String notificationID);
    void deleteNotification(String notificationID);
}
