import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list;

    public ListSortable() {
        list = new ArrayList<>();
    }

    public void add(E e) {
        list.add(e);
    }

    public void sort() {
        Collections.sort(list);
    }
    public void print() {
        for (E e : list) {
            System.out.println(e);
        }
    }
 }
