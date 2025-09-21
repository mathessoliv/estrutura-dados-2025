import java.util.Comparator;

public class CommentCreatedAtComparator implements Comparator<Comment> {

    public int compare(Comment c1, Comment c2) {
        return c1.getCreatedAt().compareTo(c2.getCreatedAt());
    }

}
