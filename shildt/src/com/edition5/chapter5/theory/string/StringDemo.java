package com.edition5.chapter5.theory.string;

public class StringDemo {

    public static void main(String[] args) {

        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = "Java strings are powerfull.";
        String str3 = new String(str2);


        int result, index;
        char ch;

        System.out.println("Length of str1: " + str1.length());

//        for (int i = 0; i < str1.length(); i++) {
//            System.out.print(str1.charAt(i));
//            System.out.println();
//        }
        if (str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 does not equals str2");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 equals str3");
        } else {
            System.out.println("str1 does not equals str3");
        }
        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 and str3 are equal");
        } else if (result < 0) {
            System.out.println("str1 is less than str3");
        } else {
            System.out.println("str1 is greater than str3");
        }

        str2 = " One Two Three One";
        index = str2.indexOf("One");
        System.out.println("Index of first occurrence of One: " + index);
        index = str2.lastIndexOf("One ");
        System.out.println(" Index of last occurrence of One: " + index);
    }
}
