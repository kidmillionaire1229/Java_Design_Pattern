package Creational.Singleton.Implementation.LazyInit;

public class Settings {
    private static Settings INSTANCE; 
    
    private Settings () { }
    
    public static Settings getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Settings(); 
        }
        
        return INSTANCE; 
    }
}
