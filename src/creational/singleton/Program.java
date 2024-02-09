package creational.singleton;

public class Program {
    public static void main(String[] args) {
        System.out.println("showInfo with object \"database1\":");
        Database database1 = Database.getDatabase();
        database1.showInfo();
        System.out.println();

        System.out.println("Changing Password for DB with object \"database2\"...");
        Database database2 = Database.getDatabase();
        database2.changePassword("newPass");
        System.out.println();

        System.out.println("showInfo with object \"database1\":");
        database1.showInfo();
        System.out.println();

        System.out.println("showInfo with object \"database2\":");
        database1.showInfo();
        System.out.println();
    }
}
