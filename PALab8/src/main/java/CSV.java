import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV {

    public CSV() {
        String line = "";
        String splitBy = ",";
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\andre\\IdeaProjects\\APLab8\\src\\main\\resources\\CSV\\IMDb_movies.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] movie = line.split(splitBy);
                System.out.println("Movie[Id: " + movie[0] + "| Title: " + movie[1] + "| Original Title : " + movie[2] + "| Year : " + movie[3] + "| Publication Date : " + movie[4] + "| Genre : " + movie[5] + "| Duration : " + movie[6] + "| Country : " + movie[7] + "| Language : " + movie[8] + "| Director : " + movie[9] + "| Writer : " + movie[10] + "| Production : " + movie[11] + "| Actors : " + movie[12] + "| Description : " + movie[13] + "| Average Vote : " + movie[14] + "| Number of Votes : " + movie[15] + "]");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
