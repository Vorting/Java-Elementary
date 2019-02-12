package com.edition5.chapter5.theory.encode;

// Использование операции поразрядного исключающего ИЛИ
// для шифрования и дешифрования сообщений,
public class Encode {
    public static void main(String[] args) {
        String msg = " This is a test message";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        //зашифруем
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.print("Encode message: ");
        System.out.println(encmsg);

        for (int j = 0; j < msg.length(); j++) {
            decmsg = decmsg + (char) (encmsg.charAt(j) ^ key);
        }
        System.out.print("Decode message: ");
        System.out.println(decmsg);
    }
}
