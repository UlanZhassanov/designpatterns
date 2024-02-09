package creational.singleton;

public class Database {
    private static Database database;
    private static String dbName = "myDB";
    private static String password = "123";

    private Database(){

    }

    //Делаем синхронайзед, чтобы избегать проблем при многопоточности
    public static synchronized Database getDatabase(){
        if (database == null){
            database = new Database();
        }
        return database;
    }

    public void showInfo(){
        System.out.println(dbName);
        System.out.println(password);
    }

    public void changePassword(String newPassword){
        password = newPassword;
    }
}
