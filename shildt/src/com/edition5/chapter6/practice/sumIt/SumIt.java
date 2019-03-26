package com.edition5.chapter6.practice.sumIt;

public class SumIt {
    int sum(int... number) {
        int res = 0;
        for (int i = 0; i < number.length; i++) {
            res += number[i];
        }
        return res;
    }
}
