package com.edition5.chapter6.theory.blockObj;

public class Block {

    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // возвратить логическое значение true, если
    // параметр ob определяет такой же параллелепипед
    //В качестве параметра методу передается объект.
    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            return true;
        } else {
            return false;
        }
    }

    // возвратить логическое значение true, если
    // параметр ob определяет параллелепипед такого же объема
    //В качестве параметра методу передается объект.
    boolean sameVolume(Block ob) {
        if (ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }

}
