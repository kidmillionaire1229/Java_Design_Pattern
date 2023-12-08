package Structural.Facade.After;

public class EmailSettings {
    private String host;

    public EmailSettings setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return host;
    }
}
