import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Comment implements Comparable<Comment>{


    public Comment(String user, String post, String text, String imageUrl) {
        this.user = user;
        this.post = post;
        this.text = text;
        this.imageUrl = imageUrl;
        onCreate();
    }

    private Long id;

    private Instant createdAt;

    private Instant updatedAt;

    private String user;

    private String text;

    private String imageUrl;

    private String post;

    private Comment parentComment;

    private List<Comment> comments = new ArrayList<>();

    protected void onCreate() {
        this.createdAt = Instant.now();
    }

    protected void onUpdate() {
        this.updatedAt = Instant.now();
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return updatedAt;
    }

    @Override
    public int compareTo(Comment other) {
        return this.user.compareTo(other.user);
    }

    @Override
    public String toString() {
        return "User: " + user + ", Post: " + post + ", Text: " + text + ", Image: " + imageUrl;
    }
}
