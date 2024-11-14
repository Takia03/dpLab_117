// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.List;
public class Main {
    public static void main(String[] args) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade();

        // Fetch and display all notifications
        List<String> notifications = socialMediaFacade.getAllNotifications();
        System.out.println("All Notifications:");
        for (String notification : notifications) {
            System.out.println(notification);
        }

        // Mark a specific notification as read
        socialMediaFacade.markNotificationAsRead("1"); // Assume "1" is an example notification ID

        // Delete a specific notification
        socialMediaFacade.deleteNotification("2"); // Assume "2" is an example notification ID
    }
}
