import java.util.List;

public class Facebook {
    public List<String> getPosts(){
        // Get posts from Facebook API
        return List.of("Post 1", "Post 2", "Post 3");
    }

    public void markPostAsRead(String postID){
        // Mark post as read in Facebook API
        System.out.println("Post marked as read");
    }

    public void deletePost(String postID){
        // Delete post in Facebook API
        System.out.println("Post deleted");
    }
}
