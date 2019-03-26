package adapter;

public class ClientCompos {


    public static void main(String[] args) {

        Chief chief = new ChiefAdapter() {
            @Override
            public String makeSupper() {
                return makeSupper();
            }
        };

        String dinner = String.valueOf(chief.makeDinner());

        System.out.print(dinner);
    }
}
