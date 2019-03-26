package com.edition5.chapter5.practice;
/* Расширьте класс Encode таким образом, чтобы в качестве ключа шифрования
 использовалась строка из восьми символов.
 */

public class Exercise7 {
    public static void main(String[] args) {

        String msg = " This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Original message: ");
        System.out.println(msg);

        //зашифруем
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) {
                j = 0;
            }
        }
        System.out.print("Encode message: ");
        System.out.println(encmsg);

        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) {
                j = 0;
            }
        }
        System.out.print("Decode message: ");
        System.out.println(decmsg);
    }
}
