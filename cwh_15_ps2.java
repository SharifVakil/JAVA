package com.company;

import java.util.Locale;

public class cwh_15_ps2 {
    public static void main(String[] args) {

//        Problem1
//        String name = "Jack Parker";
//        name = name.toLowerCase();
//        System.out.println(name);

//        Problem 2
//        String text = "To Lower Case";
//        text= text.replace(" ","_");
//        System.out.println(text);

//        Problem 3
        String letter= "Dear <!name!>,Thanks a lot";
        letter = letter.replace("<!name!>","Sharif");
        System.out.println(letter);

//        Problem 4
        String myString= "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        Problem 5
        String myLetter = "Dear harry\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}