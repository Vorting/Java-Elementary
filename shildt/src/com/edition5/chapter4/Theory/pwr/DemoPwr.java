package com.edition5.chapter4.Theory.pwr;

public class DemoPwr {

    public static void main(String[] args) {

        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println("x.b "+x.b+ " raised to the "+" x.e"+
                x.e+ " power is "+x.get_pwr());
        System.out.println("y.b "+y.b+ " raised to the "+" y.e"+
                y.e+ " power is "+y.get_pwr());
        System.out.println("z.b "+z.b+ " raised to the "+" z.e"+
                z.e+ " power is "+z.get_pwr());
    }
}
