package Model;
import java.util.Scanner;

public class Movies {

    public Movies() {
        int id = Integer.parseInt(null);
        String title = null;
        int year = Integer.parseInt(null);
        int month = Integer.parseInt(null);
        int day = Integer.parseInt(null);
        float score = Float.parseFloat(null);
        int duration = Integer.parseInt(null);


        Scanner idSC = new Scanner(System.in);
        System.out.print("Enter the id : ");
        while (id == Integer.parseInt(null) || id <= 0 || id >= 1000000000) {
            id = idSC.nextInt();
        }


        Scanner StringSC = new Scanner(System.in);
        System.out.println("Enter the title : ");
        while (title == null) {
            title = StringSC.nextLine();
            int count = 0;
            for (int i = 0; i < title.length(); i++)
                count++;
            if (count >= 150)
                title = null;
        }

        Scanner yearSC = new Scanner(System.in);
        System.out.print("Enter the year : ");
        while (id == Integer.parseInt(null) || id <= 0 || id >= 2022) {
            year = yearSC.nextInt();
        }

        Scanner monthSC = new Scanner(System.in);
        System.out.print("Enter the month : ");
        while (id == Integer.parseInt(null) || id <= 0 || id >= 13) {
            month = monthSC.nextInt();
        }

        Scanner daySC = new Scanner(System.in);
        System.out.print("Enter the day : ");

        if (month == 2) {
            if (year % 4 == 0) {
                while (id == Integer.parseInt(null) || id <= 0 || id >= 30) {
                    day = daySC.nextInt();
                }
            } else {
                while (id == Integer.parseInt(null) || id <= 0 || id >= 29) {
                    day = daySC.nextInt();
                }
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            while (id == Integer.parseInt(null) || id <= 0 || id >= 31) {
                day = daySC.nextInt();
            }
        } else {
            while (id == Integer.parseInt(null) || id <= 0 || id >= 32) {
                day = daySC.nextInt();
            }
        }

        Scanner durationSC = new Scanner(System.in);
        System.out.print("Enter the id : ");
        while (duration == Integer.parseInt(null) || duration <= 0 || duration >= 1000) {
            duration = durationSC.nextInt();
        }

        Scanner scoreSC = new Scanner(System.in);
        System.out.print("Enter the month : ");
        while (score == Float.parseFloat(null) || score <= 0.0 || id > 10.0) {
            score = scoreSC.nextInt();
        }

        System.out.print("Movie : " + id + " \t " + title + " \t " + year + "-" + month + "-" + day + "\t" + duration + "\t" + score);
    }
}
