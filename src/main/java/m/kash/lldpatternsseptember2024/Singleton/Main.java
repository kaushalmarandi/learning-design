package m.kash.lldpatternsseptember2024.Singleton;

public class Main {
    public static void main(String[] args) {
        Databaseconnection databaseconnection1=Databaseconnection.getInstance();
        Databaseconnection databaseconnection2=Databaseconnection.getInstance();

        System.out.println("DEBUG");
    }
}
