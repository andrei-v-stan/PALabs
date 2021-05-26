package app;

import com.DisplayLocales;
import com.Info;
import com.SetLocale;

import java.util.Locale;
import java.util.Scanner;

public class LocaleExplore {

    public static boolean lb;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        SetLocale.setLocale(Locale.ENGLISH);
        System.out.println("\nWelcome to Internationalization and Localization");
        System.out.println("You can change the chosen language by introducing the command 'langs', you can also 'exit' at any time.");


        while (true) {
            System.out.println("\n\nPlease choose one of these executions: PROMPT / EXIT");
            String command = keyboard.nextLine();

            if (command.equalsIgnoreCase("prompt")) {

                while (true) {
                    System.out.println("Enter the desired language : EN / RO");
                    command = keyboard.nextLine();

                    if (command.equalsIgnoreCase("en")) {
                        lb = false;

                        while (true) {
                            System.out.println("Enter one of the given commands : LOCALES / LOCALES.SET / INFO");
                            command = keyboard.nextLine();

                            if (command.equalsIgnoreCase("locales")) {
                                System.out.println("Here's a list of the available locales :");
                                DisplayLocales.getLocales();
                            } else if (command.equalsIgnoreCase("locales.set")) {
                                System.out.println("The current locale is:");
                                DisplayLocales.getDefaultLocale("en");
                            } else if (command.equalsIgnoreCase("info")) {
                                System.out.println("Enter a country tag (US, RO, FR, IN, RU, etc)");
                                String tag = keyboard.nextLine();
                                SetLocale.setLocale(Locale.ENGLISH);
                                Locale roLocale = new Locale(tag.toLowerCase(), tag.toUpperCase());
                                System.out.println("Here's the information regarding the given tag:");
                                Info.displayInfo(roLocale);
                            } else if (command.equalsIgnoreCase("langs")) {
                                break;
                            } else if (command.equalsIgnoreCase("exit")) {
                                System.out.println("Very well, the program will now shut down");
                                System.exit(0);
                            } else System.out.println("The command entered is not from the given list");
                        }

                    } else if (command.equalsIgnoreCase("ro")) {
                        lb = true;

                        while (true) {
                            System.out.println("Introduce una dintre comenzile date: LOCALES / LOCALES.SET / INFO");
                            command = keyboard.nextLine();

                            if (command.equalsIgnoreCase("locales")) {
                                System.out.println("Aici aveti o lista de localizari disponibile:");
                                DisplayLocales.getLocales();
                            } else if (command.equalsIgnoreCase("locales.set")) {
                                System.out.println("Localizarea actuala este:");
                                DisplayLocales.getDefaultLocale("ro");
                            } else if (command.equalsIgnoreCase("info")) {
                                System.out.println("Introduce eticheta unei tari (US, RO, FR, IN, RU, etc)");
                                String tag = keyboard.nextLine();
                                SetLocale.setLocale(Locale.ENGLISH);
                                Locale roLocale = new Locale(tag.toLowerCase(), tag.toUpperCase());
                                System.out.println("Aici aveti informatia asociata etichetei introduse:");
                                Info.displayInfo(roLocale);
                            } else if (command.equalsIgnoreCase("langs")) {
                                break;
                            } else if (command.equalsIgnoreCase("exit")) {
                                System.out.println("Prea bine, programul se va inchide acum");
                                System.exit(0);
                            } else System.out.println("Comanda introdusa nu apartine din lista data");
                        }
                    } else if (command.equalsIgnoreCase("exit")) {
                        System.out.println("Very well, the program will now shut down");
                        System.exit(0);
                    } else System.out.println("The language entered is not available right now");
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Very well, the program will now shut down");
                System.exit(0);
            } else System.out.println("The command entered does not exist");
        }

    }
}
