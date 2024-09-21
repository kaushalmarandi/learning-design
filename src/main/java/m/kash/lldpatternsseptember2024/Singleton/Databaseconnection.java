package m.kash.lldpatternsseptember2024.Singleton;

public class Databaseconnection {

    private static Databaseconnection instance = null;

    String url;
    String username;
    String password;

    private Databaseconnection() {

    }

    //double check locking

    public static Databaseconnection getInstance() {
        if (instance == null) {
            synchronized (Databaseconnection.class){
                if (instance==null){
                    instance= new Databaseconnection();
                }
            }
        }
        return instance;
    }
}

