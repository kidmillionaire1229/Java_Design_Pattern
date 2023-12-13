package Creational.Singleton.Implementation.Lazyholder;

public class Settings {
    private Settings() { }

    private static class SettingsHolder {

        //inner static class이므로 외부 클래스인 Settings가 초기화되더라도 로딩되지 않음
        //외부 클래스의 getInstance 호출을 진행하면, 내부클래스가 초기화되어 INSTANCE 객체 생성
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
