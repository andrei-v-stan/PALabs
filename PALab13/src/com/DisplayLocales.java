package com;

import java.util.Locale;

public class DisplayLocales {

    public static void getDefaultLocale(String lan) {
        if (!lan.toLowerCase().equals("ro"))
            System.out.println(Locale.getDefault());
        else System.out.println("ro");
    }

    public static void getLocales() {

        Locale available[] = Locale.getAvailableLocales();
        if (app.LocaleExplore.lb == false) {
            for (Locale locale : available) {
                System.out.println("Country:  " + locale.getDisplayCountry() + " -&- " + locale.getDisplayLanguage(locale));
            }
        } else if (app.LocaleExplore.lb == true) {
            for (Locale locale : available) {
                System.out.println("Tara:  " + locale.getDisplayCountry() + " -&- " + locale.getDisplayLanguage(locale));
            }
        }
    }


}
