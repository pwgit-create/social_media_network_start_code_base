
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Instantiate some objects to demonstrate usage of other classes
        User user = new User("Peter", "snow_900@outlook.com", "my password");
        Post post = new Post(user, "Post content");
        Comment comment = new Comment(user, post, "Comment content");
        Message message = new Message(user, user, "Message content");
        Friendship friendship = new Friendship(user, user);
        Notification notification = new Notification(user, post, "Notification type");
        Feed feed = new Feed(user);
        Profile profile = new Profile(user);


        List<User> users = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        List<Comment> comments = new ArrayList<>();
        List<Message> messages = new ArrayList<>();
        List<Friendship> friendships = new ArrayList<>();

        Search search = new Search(users, posts, comments, messages, friendships);


        search.setMockUserForTest(user);
        System.out.println(search.searchUsers("Peter").get(0).getEmail());
    }
} 