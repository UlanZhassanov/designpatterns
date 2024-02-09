package structural.bridge;

public class ClothesProgram {
    public static void main(String[] args) {
        Clothes clothes = new Hat(new HatCharacteristics());

        //just for calling with methods
        System.out.println(clothes.getSeason());
        System.out.println(clothes.getType());

        System.out.println(clothes);
    }
}
