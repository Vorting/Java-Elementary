package com.edition5.chapter3.Theory;

import java.io.IOException;

public class KbIn {

    public static void main(String[] args) throws IOException {

        int ch;
        System.out.println("Press a key followed by ENTER: ");

        ch = (char) System.in.read();

        System.out.println("Your key is: " + ch);

    }
}
