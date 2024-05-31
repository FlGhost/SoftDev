package notification;

public class Main {
    public static void main(String[] args) {
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        Notifier notifier = new Notifier();
        WebsiteChecker websiteChecker = new WebsiteChecker(subscriptionManager, notifier);

        // Register a user
        User user = new User("user@example.com");
        subscriptionManager.registerUser(user);

        // Add a subscription
        Subscription subscription = new Subscription("http://example.com", "daily", "email");
        user.addSubscription(subscription);

        // Start checking for updates
        websiteChecker.startChecking();

        // Allow the program to run for some timeto see notifications
        try {
            Thread.sleep(5 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}