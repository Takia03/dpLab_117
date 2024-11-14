import java.util.List;

public class Twitter {
    public List<String>getTweets(){
        // Get tweets from Twitter API
       return List.of("Tweet 1", "Tweet 2", "Tweet 3");
    }

    public void markTweetAsRead(String tweetID){
        // Mark tweet as read in Twitter API
        System.out.println("Tweet marked as read");
    }

    public void deleteTweet(String tweetID){
        // Delete tweet in Twitter API
        System.out.println("Tweet deleted");
    }
}
