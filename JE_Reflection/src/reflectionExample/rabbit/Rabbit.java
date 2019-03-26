package reflectionExample.rabbit;

public class Rabbit {

    @Deprecated
    @RabbitAnnotation
    private String rabbitName;
<<<<<<< HEAD
    @Deprecated
=======

    @Deprecated
    @RabbitAnnotation
>>>>>>> 2ab41ef6efadbd50e4dea48f90df45a6d50b762c
    private String rabbitAge;

    public String getRabbitName() {
        return rabbitName;
    }

    public String getRabbitAge() {
        return rabbitAge;
    }
}
