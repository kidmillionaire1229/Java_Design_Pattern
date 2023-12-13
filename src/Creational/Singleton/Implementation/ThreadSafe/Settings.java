package Creational.Singleton.Implementation.ThreadSafe;


public class Settings {
    private static Settings INSTANCE; 
    
    private Settings() { }
    
    public static synchronized Settings getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Settings(); 
        }
        return INSTANCE; 
    }
}
