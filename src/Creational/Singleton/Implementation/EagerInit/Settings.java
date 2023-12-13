package Creational.Singleton.Implementation.EagerInit;

public class Settings {

    //프로그램 로딩 시점에 만들어지므로 thread - safe
    private static final Settings INSTANCE = new Settings();

    private Settings() { }

    public static Settings getInstance() {
        return INSTANCE;
    }
}
