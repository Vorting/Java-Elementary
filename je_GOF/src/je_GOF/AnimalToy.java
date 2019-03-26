package je_GOF;

public class AnimalToy {
    static class WoodenCat extends Cat {
        private String name;

        public String getName() {
            return "Wooden Cat";
        }
    }

    static class TeddyCat extends Cat {
        public String getName() {
            return "Teddy Cat";
        }
    }

    static class WoodenBear extends Bear {
        public String getName() {
            return "Wooden Bear";
        }
    }

    static class TeddyBear extends Bear {
        public String getName() {
            return "Teddy Bear";
        }
    }
}
