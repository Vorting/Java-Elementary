package decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation();//"Hello world"
        c.newOperation(); //"New hello operation"
    }
}
