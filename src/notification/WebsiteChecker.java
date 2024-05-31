package notification;

import java.util.Timer;
import java.util.TimerTask;

public class WebsiteChecker {
    private SubscriptionManager subscriptionManager;
    private Notifier notifier;

    public WebsiteChecker(SubscriptionManager subscriptionManager, Notifier notifier) {
        this.subscriptionManager = subscriptionManager;
        this.notifier = notifier;
    }

    public void startChecking() {
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                checkForUpdates();
            }
        }, 0, 60000); // Check every minute
    }

    private void checkForUpdates() {
        for (User user : subscriptionManager.getUsers()) {
            for (Subscription subscription : user.getSubscriptions()) {
                if (hasUpdate(subscription.getUrl())) {
                    notifier.notify(user, "Update detected at " + subscription.getUrl());
                }
            }
        }
    }

    private boolean hasUpdate(String url) {
        // Simulate an update check. In a real system, you would check the website's content.
        return Math.random() > 0.5;
    }
}