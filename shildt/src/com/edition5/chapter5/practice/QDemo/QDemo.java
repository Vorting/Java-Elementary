package com.edition5.chapter5.practice.QDemo;


import com.edition5.chapter5.practice.Queue.Queue;

public class QDemo {

    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");

        //помещаем буквенные символы в очередь biqQ

        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.print("Отображаем  символы очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
            System.out.print(" ");
        }
        System.out.println("\nИспуользуем smallQ для генерации ошибок.");
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.print("");

        System.out.print("Содержимое в smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch!=(char)0){
                System.out.print(ch);
            }
        }
    }

}
