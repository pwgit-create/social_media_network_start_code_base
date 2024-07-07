
import java.util.*;

public class Search {
    private List<User> users;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Message> messages;
    private List<Friendship> friendships;

    public Search(List<User> users, List<Post> posts, List<Comment> comments, List<Message> messages, List<Friendship> friendships) {
        this.users = users;
        this.posts = posts;
        this.comments = comments;
        this.messages = messages;
        this.friendships = friendships;
    }

    public List<User> searchUsers(String query) {
        List<User> results = new ArrayList<>();
        for (User user : users) {
            if (user.getUsername().contains(query) || user.getEmail().contains(query)) {
                results.add(user);
            }
        }
        return results;
    }

    public List<Post> searchPosts(String query) {
        List<Post> results = new ArrayList<>();
        for (Post post : posts) {
            if (post.getContent().contains(query)) {
                results.add(post);
            }
        }
        return results;
    }

    public List<Comment> searchComments(String query) {
        List<Comment> results = new ArrayList<>();
        for (Comment comment : comments) {
            if (comment.getContent().contains(query)) {
                results.add(comment);
            }
        }
        return results;
    }

    public List<Message> searchMessages(String query) {
        List<Message> results = new ArrayList<>();
        for (Message message : messages) {
            if (message.getContent().contains(query)) {
                results.add(message);
            }
        }
        return results;
    }

    /**
     * I added this method to show the function of this code base /pwgit-create
     * @param user The user of the social network
     */
    public void setMockUserForTest(User user){

        users = new LinkedList<>();

        users.add(user);
    }
}
// 