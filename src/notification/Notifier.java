package notification;

public class Notifier {
    public void notify(User user, String message) {
        // print the notification. In a real system, you might send an email or SMS.
        System.out.println("Notification to " + user.getEmail() + ": " + message);
    }
}