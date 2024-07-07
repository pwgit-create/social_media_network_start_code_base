
import java.util.ArrayList;
import java.util.List;

public class Profile {
    private User user;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Message> messagesSent;
    private List<Message> messagesReceived;
    private List<Friendship> friendships;
    private Feed feed;
    private List<Notification> notifications;

    // Constructor
    public Profile(User user) {
        this.user = user;
        this.posts = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.messagesSent = new ArrayList<>();
        this.messagesReceived = new ArrayList<>();
        this.friendships = new ArrayList<>();
        this.feed = new Feed(user);
        this.notifications = new ArrayList<>();
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Methods to add or remove posts, comments, messages, friendships, notifications
    public void addPost(Post post) {
        posts.add(post);
        feed.addPost(post);
    }

    public void removePost(Post post) {
        posts.remove(post);
        feed.removePost(post);
    }

    // Similar methods for comments, messages, friendships, notifications can be added here...
} 