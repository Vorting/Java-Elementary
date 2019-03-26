package com.edition5.chapter4.practice.helpClassDemo;

import java.io.IOException;

public class HelpClassDemo {

    public static void main(String[] args) throws IOException {

        char choice, ignore;

        HelpOn hlpObj = new HelpOn();
        ShowMenu showMenu = new ShowMenu();
        IsValid isValid = new IsValid();

        for (; ; ) {
            do {
                showMenu.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!isValid.isValid(choice));
            if (choice == 'q') {
                System.out.println("q - quitting...Bye!");
                break;
            }
            System.out.println("\n");
            hlpObj.helpOn(choice);
        }
    }
}

