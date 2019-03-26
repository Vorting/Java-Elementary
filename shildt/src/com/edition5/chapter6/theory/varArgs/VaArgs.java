package com.edition5.chapter6.theory.varArgs;

 class VaArgs {

    //метод vaTest() с аргументами пременной длинны.
    // объявление списка аргументов переменной длинны.
    static  void vaTest(int ... v){
        System.out.println("Number of args: "+ v.length);
        System.out.println("Contents: ");

        for (int i=0; i<v.length;i++){
            System.out.println(" args"+ i+": "+v[i]);
        }
        System.out.println();
    }

     public static void main(String[] args) {

        // метод vaTest() может вызываться с переменным числом аргументов.
         vaTest(10); // 1 аргумент
         vaTest(1,2,3); // 3 аругмента
         vaTest(); // без аргументов
     }
}
