package decorator;

public interface InterfaceComponent {

void doOperation();
}

class MainComponent implements InterfaceComponent {

    @Override
    public void doOperation() {
        System.out.print("World!");
    }


}
