package Structural.Flyweight;

public class Font {

    private final String family;
    private int size;
    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Font{" +
                "family='" + family + '\'' +
                ", size=" + size +
                '}';
    }
}
