
import java.util.ArrayList;
import java.util.List;

public class Notification {
    private User user;
    private Post post;
    private Comment comment;
    private Message message;
    private String notificationText;

    public Notification(User user, Post post, String notificationText) {
        this.user = user;
        this.post = post;
        this.notificationText = notificationText;
    }

    public Notification(User user, Comment comment, String notificationText) {
        this.user = user;
        this.comment = comment;
        this.notificationText = notificationText;
    }

    public Notification(User user, Message message, String notificationText) {
        this.user = user;
        this.message = message;
        this.notificationText = notificationText;
    }

    // Getters and Setters for the fields
} 