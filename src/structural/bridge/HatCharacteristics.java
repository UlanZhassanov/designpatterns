package structural.bridge;

public class HatCharacteristics implements ClothesCharacteristics {
    private int size = 58;
    private String color = "Black";

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "HatCharacteristics{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
