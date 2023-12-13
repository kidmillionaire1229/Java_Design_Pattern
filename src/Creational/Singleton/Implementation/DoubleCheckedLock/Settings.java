package Creational.Singleton.Implementation.DoubleCheckedLock;

public class Settings {
    private static volatile Settings INSTANCE;

    private Settings() { }

    public static Settings getInstance() {
        if(INSTANCE == null){
            synchronized (Settings.class) {
                if (INSTANCE == null)
                    INSTANCE = new Settings();
            }
        }
        return INSTANCE;
    }
}
