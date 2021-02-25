package com.company;

public class Main {

    public static void main(String[] args) {

        // Simple printing "Hello World"
        System.out.println("Hello World");

        // Creating the array of strings (for a unknown amount of strings) called languages, having values from 0 to 9.
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        // System.out.println(languages[0]); printing out the first string from the array.

        int n = (int) (Math.random() * 1_000_000); // n recives the value of a random number between 0 and 1000000.

        n = n * 3;  // We can check the value of n with : System.out.println(n);
                    // We can show the value of n in Binary format : System.out.println(Integer.toBinaryString(n));

        n = n + Integer.parseInt("10101",2);
                    // Converts the given binary number "10101" to decimal and adds it to n, we can check it with : System.out.println(Integer.toBinaryString(n));

        n = n + Integer.parseInt("FF", 16);
                    // Converts the given hex value "FF" to decimal and adds it to n, we can check it with : System.out.println(Integer.toHexString(n));

        n = n * 6;
        System.out.println(n);



        int x=0,y=0;
        while (n>0) {x = n%10; n = n/10;}

        while((x/10)>0) {y = x%10; x = x/10;}

        System.out.println("Willy-nilly, this semester I will learn " + languages[x]);




    }

}
