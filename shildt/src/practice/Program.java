package practice;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(123); //int -> Integer
        list.add("Hello!");
        list.add(false);// boolean-> Boolean
        list.add(3.14); //double-> Double
        list.add((short) 500);// short->Short
        list.add(123456789123456789L);
        list.add(new Object());
        list.add(new Program());
       list.add(3,"Third");
       list.add(3.14f);
       list.add("Last");

        for (Object o:list) {
            System.out.println(o);
        }

    }
}
