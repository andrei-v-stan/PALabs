
import commands.Catalog;
import multimedia.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        Song S1 = new Song();
        Song S2 = new Song();
        Song S3 = new Song();
        S1.setName("Overlord OP 1 redone - the song");
        S1.setPath("D:\\Files\\Overlord.mp3");
        S1.setAuthor("Nathan Sharp");
        S2.setName("Tanya OP 1 remix - the song");
        S2.setPath("D:\\Files\\Tanya.mp3");
        S2.setAuthor("Lee and Lie");
        S3.setName("Goddess - the song");
        S3.setPath("D:\\Files\\Tanya.mp3");
        S3.setAuthor("Cepheid");

        Movie M1 = new Movie();
        Movie M2 = new Movie();
        Movie M3 = new Movie();
        M1.setName("Overlord OP 1 redone - the video");
        M1.setPath("D:\\Files\\Overlord.mp4");
        M1.setRating("3 out of 5 stars");
        M2.setName("Tanya OP 1 remix - the video");
        M2.setPath("D:\\Files\\Tanya.mp4");
        M2.setRating("4 out of 5 stars");
        M3.setName("Goddess - the video");
        M3.setPath("D:\\Files\\Tanya.mp4");
        M3.setRating("4.5 out of 5 stars");

        Book B1 = new Book();
        Book B2 = new Book();
        Book B3 = new Book();
        B1.setName("Overlord OP 1 redone - the book");
        B1.setPath("D:\\Files\\Overlord.mp4");
        B1.setAuthor("3 out of 5 stars");
        B2.setName("Tanya OP 1 remix - the book");
        B2.setPath("D:\\Files\\Tanya.mp4");
        B2.setAuthor("4 out of 5 stars");
        B3.setName("Goddess - the book");
        B3.setPath("D:\\Files\\Tanya.mp4");
        B3.setAuthor("4.5 out of 5 stars");

        Image I1 = new Image();
        Image I2 = new Image();
        Image I3 = new Image();
        I1.setName("Overlord OP 1 redone - the image");
        I1.setPath("D:\\Files\\Overlord.jpg");
        I2.setName("Tanya OP 1 remix - the image");
        I2.setPath("D:\\Files\\Tanya.png");
        I3.setName("Goddess - the image");
        I3.setPath("D:\\Files\\Tanya.jpg");

        catalog.add(S1);
        catalog.add(M1);
        catalog.add(B1);
        catalog.add(I1);
        catalog.add(S2);
        catalog.add(M2);
        catalog.add(B2);
        catalog.add(I2);
        catalog.add(S3);
        catalog.add(M3);
        catalog.add(B3);
        catalog.add(I3);

        Scanner command = new Scanner(System.in);
        String comm;
        System.out.println("Please enter your command :");
        comm = command.nextLine();

    }
}
