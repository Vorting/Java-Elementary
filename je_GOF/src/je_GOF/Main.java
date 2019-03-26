package je_GOF;

import je_GOF.ConcreteFactory.WoodenToysFactory;

public class Main {

    public static void main(String[] args) {

        ToyFactory toyFactory = new WoodenToysFactory();
        Bear bear = toyFactory.getBear();
        Cat cat = toyFactory.getCat();
        System.out.println();
        System.out.printf("I've got %s and %s", bear.getName(), cat.getName());
// Вывод на консоль будет: [I've got Wooden Bear and Wooden Cat]

// А теперь создадим «плюшевую» фабрику, следующая линейка является единственной разницей в коде
        toyFactory = new ConcreteFactory.TeddyToysFactory();
// Как видим код ниже не отличается  от приведенного выше
        Bear bear1 = toyFactory.getBear();
        Cat cat1 = toyFactory.getCat();

        System.out.println();
        System.out.printf("I've got %s and %s", bear1.getName(), cat1.getName());
// А вывод на консоль будет другой: [I've got Teddy Bear and Teddy Cat]
    }
}
