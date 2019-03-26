package myCalssTest;

import java.lang.reflect.Field;

public class MyClassDemo {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
//        int number = MyClass.getNumber();
        String name = null;
        myClass.printData(myClass);

        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass, (String) "new value");
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        myClass.printData(myClass);
    }
}
