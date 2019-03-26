package adapter;

public class Client {

    public static void eat(Object dish) {
        System.out.println(dish);
    }

    public static void main(String[] args) {
        Chief ch = new ChiefAdapter() {
            @Override
            public String makeSupper() {
                return makeSupper();
            }
        };
        Object dish = ch.makeBreakfast();
        eat(dish);
        dish = ch.makeLunch();
        eat(dish);
        dish = ch.makeDinner();
        eat(dish);

    }
}
