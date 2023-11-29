package Iterator.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class JavaIterator {

    public static void main(String[] args) {
        //1.Treeset
        TreeSet<Integer> aggregate = new TreeSet<>(List.of(1, 2, 3, 4, 5));

        //hasNext(), next(), remove()
        Iterator<Integer> itr = aggregate.iterator();
        while (itr.hasNext()){
            System.out.printf("%d 삭제", itr.next());
            System.out.println("");
            itr.remove();
        }
        //forEachRemaining
        aggregate.iterator().forEachRemaining(System.out::println);

        //2.HashSet
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("mango");

        set.iterator().forEachRemaining((fruit) -> {
            System.out.printf("My favorite food is %s!",fruit);
            System.out.println("");
        });
    }
}
