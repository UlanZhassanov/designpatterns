package structural.bridge;

public abstract class Clothes {
    protected ClothesCharacteristics clothesCharacteristics;

    public Clothes(ClothesCharacteristics clothesCharacteristics) {
        this.clothesCharacteristics = clothesCharacteristics;
    }

    public abstract String getType();
    public abstract String getSeason();
}
