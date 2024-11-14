import java.util.List;

public class TwitterAdapter implements INotification {
    private Twitter twitter;

    public TwitterAdapter(Twitter twitter) {
        this.twitter = twitter;
    }

    @Override
    public List<String> getNotifications() {
        return twitter.getTweets();
    }

    @Override
    public void markAsRead(String notificationID) {
        twitter.markTweetAsRead(notificationID);
    }

    @Override
    public void deleteNotification(String notificationID) {
        twitter.deleteTweet(notificationID);
    }
}
