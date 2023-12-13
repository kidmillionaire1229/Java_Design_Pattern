package Creational.Singleton.Example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

    private static Logger logger = Logger.getLogger(LoggerExample.class.getName());
    public static void main(String[] args) {
        logger.info("This is level info logging");
        logger.log(Level.WARNING, "This is level warning logging");
        logger.log(Level.SEVERE, "This is level severe loggging");
        System.out.println("Hello Java Logging APIs");
    }
}
