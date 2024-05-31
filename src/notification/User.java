package notification;

import java.util.List;

public class User {
    private String email;
    private List<Subscription> subscriptions;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public void removeSubscription(Subscription subscription) {
        subscriptions.remove(subscription);
    }
}