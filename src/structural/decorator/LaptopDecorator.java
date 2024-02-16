package structural.decorator;

public class LaptopDecorator implements Laptop {
    Laptop laptop;

    public LaptopDecorator(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void openDocs() {
        laptop.openDocs();
    }
}
