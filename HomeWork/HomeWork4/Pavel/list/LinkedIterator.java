package HomeWork4.Pavel.list;

import java.util.Iterator;

public class LinkedIterator<T> implements Iterator<T> {
    private Node<T> current;

    public LinkedIterator(Node<T> current) {
        this.current = current;
    }


    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T temp = current.item;
        current = current.next;
        return temp;
    }
}
