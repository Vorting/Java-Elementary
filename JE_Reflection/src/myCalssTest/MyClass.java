package myCalssTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass {
    private int number;
    private String name = "default";
//        public MyClass(int number, String name) {
//        this.number = number;
//        this.name = name;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData(Object myClass) {
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
