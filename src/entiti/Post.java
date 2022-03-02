package entiti;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String comment;
    private Integer likes;

    private List<Coment> comments = new ArrayList<>();

    public Post(){}

    public Post(Date moment, String title, String comment, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.comment = comment;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Coment> getComments() {
        return comments;
    }

    public void addComments(Coment comment){
        comments.add(comment);
    }

    public void removeComments(Coment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Comments: \n");
        sb.append(comment + "\n");
        for (Coment c: comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
