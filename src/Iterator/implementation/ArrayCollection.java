package Iterator.implementation;

public class ArrayCollection implements IterableCollection {
    Object[] array;
    int index = 0;

    public ArrayCollection(int size) {
        this.array = new Object[size];
    }

    public void append(Object obj){
        if(index < array.length)
            array[index++] = obj;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(array);
    }
}
