package app;

import entiti.Coment;
import entiti.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Coment c1 = new Coment("Have a nice trip");
        Coment c2 = new Coment("Wow that's awesome!");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12
                );
        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);
    }
}
