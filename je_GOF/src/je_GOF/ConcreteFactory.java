package je_GOF;

public class ConcreteFactory {
    public static class TeddyToysFactory implements ToyFactory {
        public Bear getBear() {
            return new AnimalToy.TeddyBear();
        }

        public Cat getCat() {
            return new AnimalToy.TeddyCat();
        }
    }

    //  еще одна конкретная фабрика
    public static class WoodenToysFactory implements ToyFactory {
        public Bear getBear() {
            return new AnimalToy.WoodenBear();
        }

        public Cat getCat() {
            return new AnimalToy.WoodenCat();
        }
    }

}
