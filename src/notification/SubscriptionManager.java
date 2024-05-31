package notification;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionManager {
    private List<User> users;

    public SubscriptionManager() {
        users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void unregisterUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }
}