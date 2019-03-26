package com.edition5.chapter6.practice.sumIt;

public class SumDemo {

    public static void main(String[] args) {

        SumIt sumIt=new SumIt();

        int  totalRes=sumIt.sum(1,2,3);
        System.out.println("Sum is "+ totalRes);


        totalRes=sumIt.sum(2,4,1,5,4,2,1,5);
        System.out.println(" this is sum "+totalRes);
    }
}
