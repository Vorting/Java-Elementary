package adapter;

public abstract class ChiefAdapter extends MilkChief implements Chief {

    public Object makeBreakfast() {
        return getChees();
    }

    public Object makeLunch() {
        return getMilk();
    }

    public Object makeDinner() {
        return getMilkPie();
    }
}
