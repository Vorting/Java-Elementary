package reflectionExample;

import reflectionExample.rabbit.RabbitAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {

    public void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }

    }

    public void showClassMethods(Object object) {
        Class clazz = object.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }


    public void showFieldsAnnotations(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();

            for (Annotation annotation : annotations) {
                System.out.println(field.getName() + ": " + annotation.toString());
            }
        }
    }

<<<<<<< HEAD
    public void fillPrivateFields(Object object) {
=======
    public void fillPrivateFields(Object object) throws IllegalAccessException {
>>>>>>> 2ab41ef6efadbd50e4dea48f90df45a6d50b762c
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(RabbitAnnotation.class);
<<<<<<< HEAD
        }


=======
            if (annotation == null) {
                continue;
            }

            field.setAccessible(true);
            field.set(object, "Field");
            field.setAccessible(false);
        }
    }

    public Object createNewObject(Object object) throws IllegalAccessException, InstantiationException {
        Class clazz = object.getClass();
        return clazz.newInstance();
>>>>>>> 2ab41ef6efadbd50e4dea48f90df45a6d50b762c
    }
}
