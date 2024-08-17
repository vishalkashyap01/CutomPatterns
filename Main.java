package com.vishal.CustomPattern;

import java.util.Scanner;

class CustomPattern {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        String str;
        short number = 0;

        System.out.print("enter any name : ");
        str = sc.nextLine();

        // Casting to lower-case
        str = str.toLowerCase();

        // Alphabet class's object creation
        Alphabet spt = new Alphabet();

        // Number class's object to creation
        Number npt = new Number();
        npt.printNumberPattern(number);

        for(int counter=0; counter<str.length(); counter++)
        {
            char letter = str.charAt(counter);

            //call o method selectLetterPattern to print pattern of specific letter on console
            spt.selectLetterPattern(letter);
        }
    }
}

//System.out.print('\u0000');
