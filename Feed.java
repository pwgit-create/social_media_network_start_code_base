
import java.util.*;

public class Feed {
    private List<Post> posts;
    private User user;

    public Feed(User user) {
        this.user = user;
        this.posts = new ArrayList<>();
    }

    // Add a post to the feed
    public void addPost(Post post) {
        if (post != null && post.getUser().equals(this.user)) {
            this.posts.add(post);
        } else {
            throw new IllegalArgumentException("Cannot add a post from another user");
        }
    }

    // Remove a post from the feed
    public void removePost(Post post) {
        if (post != null && post.getUser().equals(this.user)) {
            this.posts.remove(post);
        } else {
            throw new IllegalArgumentException("Cannot remove a post that is not in your feed");
        }
    }

    // Get all posts in the feed
    public List<Post> getPosts() {
        return Collections.unmodifiableList(this.posts);
    }
} 