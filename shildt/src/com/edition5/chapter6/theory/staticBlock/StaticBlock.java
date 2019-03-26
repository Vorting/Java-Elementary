package com.edition5.chapter6.theory.staticBlock;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;


    //этот блок выполняется при загрузке класса
    static {
        System.out.println(" inside static block");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg){
        System.out.println(msg);
    }
}
