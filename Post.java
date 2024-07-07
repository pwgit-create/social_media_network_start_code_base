
import java.util.Objects; // Imported for using Objects class methods (equals and hashCode)

public class Post {
    private User user;
    private String content;

    public Post(User user, String content) {
        this.user = user;
        this.content = content;
    }

    // Getter and Setter for user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter and Setter for content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;
        Post post = (Post) o;
        return Objects.equals(getUser(), post.getUser()) && Objects.equals(getContent(), post.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getContent());
    }
} 