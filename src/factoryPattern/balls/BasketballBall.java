package factoryPattern.balls;

public class BasketballBall implements Ball {
    private int size = 15;
    private String color = "Orange";


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
