package com.homeWork;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriterReaderDemo {

    public static void main(String[] args) {

        String greetings = "Hello there! This is a simple example of my HomeWork: ";
        System.out.println(greetings);

        try (FileWriter fileWriter = new FileWriter("D:\\spongeBob.txt", false)) {
            String song = "Are you ready kids?" + "\n— Aye Aye Captain.\n" + "I can't hear you." +
                    "\n— Aye Aye Captain!" + "\nWhoooo, who lives in a pineapple under the sea?" +
                    "\n— SpongeBob SquarePants!" + "\nAbsorbant and yellow and porous is he!" +
                    "\n— SpongeBob SquarePants!" + "\nIf nautical nonsense be something you wish!" +
                    "\n— SpongeBob SquarePants!" + "\nThen drop on the deck and flop like a fish!" +
                    " \n— SpongeBob SquarePants!" + "\nReady?" + "\n— SpongeBob SquarePants, SpongeBob SquarePants,\n" +
                    "SpongeBob SquarePants!" + "\nSpongeBob SquarePaaaaannttss!!! HA HA HA HA !!!!";
            fileWriter.write(song);
            //запись по символам
            fileWriter.append('\n');
//            fileWriter.append('e');
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//
//        try (FileReader reader = new FileReader("D:\\spongeBob.txt")) {
//            // читаем по символам
//            int c;
//
//            while ((c = reader.read()) != -1) {
//                System.out.println((char) c);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        // read the song now
        try (FileReader reader = new FileReader("D:\\spongeBob.txt")) {
            char[] buf = new char[256];
            int c;

            while ((c = reader.read(buf)) > 0) {
                System.out.println(buf);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
