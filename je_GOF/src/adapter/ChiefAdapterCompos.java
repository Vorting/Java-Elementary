package adapter;

public abstract class ChiefAdapterCompos implements Chief {


    private Plumber plumber = new Plumber();

    @Override
    public String makeBreakfast() {
        return plumber.getKey();
    }

    @Override
    public String makeDinner() {
        return plumber.getScrewDriver();
    }

    @Override
    public String makeSupper() {
        return plumber.getPipe();
    }

}
