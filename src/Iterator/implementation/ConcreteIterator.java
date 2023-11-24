package Iterator.implementation;

public class ConcreteIterator implements Iterator {
    Object[] array;
    private int nextIndex = 0;

    public ConcreteIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < array.length;
    }

    @Override
    public Object Next() {
        return array[nextIndex++];
    }
}
