package com.edition5.chapter6.theory.failSoftArray;

public class FailSoftArray {
    private int[] a; // объявляем ссылку на массив
    private int errVal; // Значение, возвращаемое в	том	случае,	если
    // в методе get() будет обнаружена ошибка.
    int length; // переменная открыта
    /* Конструктору данного класса передается размер массива и значение, которое должен возврашать
    метод get() при обнаружении ошибки. */
    public FailSoftArray(int size, int errV) {
        a = new int[size];
        errVal = errV;
        length = size;
    }
    // возвратить значение элемента массива по заданному индексу
    public int getErrVal(int index) {
        //отслеживаем попытку обращения за границы массива
        if (isCurrentIndex(index)) {
            return a[index];
        }
        return errVal;
    }
    // установить значение элемента no заданному индексу,
    // если возникнет ошибка, возвратить логическое значение false
    public boolean put(int index, int val) {
        if (isCurrentIndex(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
    // возвратить логическое значение true, если индекс
    // не выходит за границы массива
    private boolean isCurrentIndex(int index) {
        if (index >= 0 & index < length) {
            return true;
        }
        return false;
    }
}
