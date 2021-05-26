package com;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.*;

public class Info {

    public static void displayInfo(Locale locale) {

        List<String> weekdays = new ArrayList<String>();

        Locale roLocale = locale;
        System.out.println(roLocale.getDisplayCountry());
        System.out.println(roLocale.getDisplayLanguage());

        Currency currency = Currency.getInstance(locale);
        System.out.println(currency.getDisplayName());


        Currency usd = Currency.getInstance(locale);
        java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(locale);
        format.setCurrency(usd);
        System.out.println(format.format(2077));

        WeekFields wf = WeekFields.of(locale);
        DayOfWeek day = wf.getFirstDayOfWeek();
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            weekdays.add(day.getDisplayName(TextStyle.FULL, locale));
            day = day.plus(1);
        }
        System.out.println(weekdays);


        DateFormatSymbols dfs = new DateFormatSymbols(locale);
        String[] months = dfs.getMonths();
        System.out.println(Arrays.toString(months));

        DateFormat full = DateFormat.getDateInstance(DateFormat.LONG, locale);
        System.out.println(full.format(new Date()));

        System.out.println("\n");


    }
}
