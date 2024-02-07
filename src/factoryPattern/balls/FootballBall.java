package factoryPattern.balls;

public class FootballBall implements Ball {
    private int size = 10;
    private String color = "White";


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
