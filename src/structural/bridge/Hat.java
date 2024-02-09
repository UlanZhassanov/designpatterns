package structural.bridge;

public class Hat extends Clothes{
    private String type = "Baseball Cap";
    private String season = "Summer";

    public Hat(ClothesCharacteristics clothesCharacteristics) {
        super(clothesCharacteristics);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "type='" + type + '\'' +
                ", season='" + season + '\'' +
                ", clothesCharacteristics=" + clothesCharacteristics +
                '}';
    }
}
