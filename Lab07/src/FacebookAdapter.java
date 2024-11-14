import java.util.List;

public class FacebookAdapter implements INotification {
    private Facebook facebook;

    public FacebookAdapter(Facebook facebook) {
        this.facebook = facebook;
    }

    @Override
    public List<String> getNotifications() {
        return facebook.getPosts();
    }

    @Override
    public void markAsRead(String notificationID) {
        facebook.markPostAsRead(notificationID);
    }

    @Override
    public void deleteNotification(String notificationID) {
        facebook.deletePost(notificationID);
    }
}
