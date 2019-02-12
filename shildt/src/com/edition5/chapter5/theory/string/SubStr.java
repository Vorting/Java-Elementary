package com.edition5.chapter5.theory.string;

public class SubStr {

    public static void main(String[] args) {

        String orgstr="Java makes the Web move.";
        String subStr = orgstr.substring(5, 18);

        System.out.println("orgstr: "+ orgstr);
        System.out.println("subStr: "+subStr);
    }
}
