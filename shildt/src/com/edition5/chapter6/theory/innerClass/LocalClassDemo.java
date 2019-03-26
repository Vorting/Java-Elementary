package com.edition5.chapter6.theory.innerClass;

class LocalClassDemo {

    public static void main(String[] args) {

        class ShowBitz {

            int numBits;

            ShowBitz(int n) {
                numBits = n;
            }

            void show(long val) {
                long mask = 1;

                //сдвинем влево для установки нужной позиции
                mask <<= numBits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                        spacer++;
                    }
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        for (byte b = 0; b < 10; b++) {
            ShowBitz byteVal = new ShowBitz(8);

            System.out.print(b + " in binary: ");
            byteVal.show(b);
        }
    }
}
