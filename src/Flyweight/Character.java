package Flyweight;

public class Character {
    private char value;
    private String color;
    //intrinsit object (Flyweight)
    private Font font;

    public Character(char value, String color, String fontFamily, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
