

import java.util.*;

public class Friendship {
    private User user1;
    private User user2;
    private boolean accepted;
    private List<Message> messages;

    public Friendship(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
        this.accepted = false;
        this.messages = new ArrayList<>();
    }

    // Getter methods
    public User getUser1() { return user1; }
    public User getUser2() { return user2; }
    public boolean isAccepted() { return accepted; }
    public List<Message> getMessages() { return messages; }

    // Setter methods
    public void setAccepted(boolean accepted) { this.accepted = accepted; }

    // Add a message to the friendship's conversation
    public void addMessage(Message message) {
        if (message.getSender().equals(user1) || message.getSender().equals(user2) &&
            message.getReceiver().equals(user1) || message.getReceiver().equals(user2)) {
            messages.add(message);
        } else {
            throw new IllegalArgumentException("The message does not belong to this friendship");
        }
    }
} 