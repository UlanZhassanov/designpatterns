package structural.decorator;

public class OfficeLaptop implements Laptop {
    @Override
    public void openDocs() {
        System.out.println("Opening the documents");
    }
}
