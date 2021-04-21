package Model;
import java.util.Scanner;

public class Junction {

    public Junction() {

        int idMovies = Integer.parseInt(null);
        int idGenres = Integer.parseInt(null);

        Scanner idMoviesSC = new Scanner(System.in);
        System.out.print("Enter the id for the movie : ");
        while (idMovies == Integer.parseInt(null) || idMovies <= 0 || idMovies >= 1000000000) {
            idMovies = idMoviesSC.nextInt();
        }

        Scanner idGenresSC = new Scanner(System.in);
        System.out.print("Enter the id for the genre : ");
        while (idGenres == Integer.parseInt(null) || idGenres <= 0 || idGenres >= 100) {
            idGenres = idGenresSC.nextInt();
        }

        System.out.print("IDs : " + idMovies + " \t " + idGenres);
    }
}
