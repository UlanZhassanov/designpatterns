package structural.decorator;

public class GamingLaptop extends LaptopDecorator {
    public GamingLaptop(Laptop laptop) {
        super(laptop);
    }

    public void playingGames() {
        System.out.println("You can play the video games with this laptop");
    }

    @Override
    public void openDocs() {
        super.openDocs();
        playingGames();
}
}
