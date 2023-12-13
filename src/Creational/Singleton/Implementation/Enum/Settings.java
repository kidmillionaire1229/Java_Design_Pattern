package Creational.Singleton.Implementation.Enum;

public enum Settings {
    INSTANCE;

    private Settings() {}

    private static Settings getInstance(){
        return INSTANCE;
    }

    private int number;
    public int getNumber(){
        return number;
    }
}
