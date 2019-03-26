package reflectionExample;

import reflectionExample.rabbit.Rabbit;
<<<<<<< HEAD

public class ReflectionDemo {

    public static void main(String[] args) {

=======

import javax.print.attribute.standard.Fidelity;
import java.lang.reflect.Field;

public class ReflectionDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

>>>>>>> 2ab41ef6efadbd50e4dea48f90df45a6d50b762c
        ReflectionChecker checker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();

//        checker.showClassName(rabbit);
//        checker.showClassFields(rabbit);
//        checker.showClassMethods(checker);
//        checker.showFieldsAnnotations(rabbit);
<<<<<<< HEAD


        System.out.println(rabbit.getRabbitAge());
        System.out.println(rabbit.getRabbitName());
=======
//        checker.fillPrivateFields(rabbit);

        Object clone = checker.createNewObject(rabbit);
        checker.showClassName(clone);

//        System.out.println(rabbit.getRabbitAge());
//        System.out.println(rabbit.getRabbitName());
>>>>>>> 2ab41ef6efadbd50e4dea48f90df45a6d50b762c
    }
}
