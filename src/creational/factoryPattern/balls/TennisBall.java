package creational.factoryPattern.balls;

public class TennisBall implements Ball {
    private int size = 5;
    private String color = "Green";


    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
