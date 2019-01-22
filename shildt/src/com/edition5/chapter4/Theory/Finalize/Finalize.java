package com.edition5.chapter4.Theory.Finalize;

public class Finalize {

    public static void main(String[] args) {

        int count;

        FDemo ob = new FDemo(0);

            /* А теперь сформировать большое количество объектов.
            В какой-то момент должна начаться "сборка мусора".
            Примечание: количество формируемых объектов, возможно,
            придется увеличить, чтобы принудить "сборку мусора". */

        for (count = 1; count < 100000;count++ ){
            ob.generator(count);
        }
    }

}
