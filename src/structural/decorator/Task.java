package structural.decorator;

public class Task {
    public static void main(String[] args) {
        Laptop laptop = new GamingLaptop(new OfficeLaptop());

        laptop.openDocs();
    }
}
