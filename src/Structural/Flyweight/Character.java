package Structural.Flyweight;

/**
 * Context (Extrinsic Object)
 * - Flyweight : Font
 * - Unique Object : value, color
 */
public class Character {
    private char value;
    private String color;
    //intrinsit object (Structural.Flyweight)
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    @Override
    public String toString() {
        return "Character{" +
                "value=" + value +
                ", color='" + color + '\'' +
                ", font=" + font +
                '}';
    }
}
