package structural.adapter;

public class Program {
    public static void main(String[] args) {
        PhoneCalling phoneCalling = new SkypeAppCallingAdapter();

        phoneCalling.call();
    }
}
