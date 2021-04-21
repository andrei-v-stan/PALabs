package Model;

import java.util.Scanner;

public class Genres {

    public Genres() {
        int id = Integer.parseInt(null);
        String name = null;


        Scanner idSC = new Scanner(System.in);
        System.out.print("Enter the id : ");
        while (id == Integer.parseInt(null) || id <= 0 || id >= 100) {
            id = idSC.nextInt();
        }


        Scanner StringSC = new Scanner(System.in);
        System.out.println("Enter the name : ");
        while (name == null) {
            name = StringSC.nextLine();
            int count = 0;
            for (int i = 0; i < name.length(); i++)
                count++;
            if (count >= 30)
                name = null;
        }

        System.out.print("Genre : " + id + " \t " + name);
    }
}
