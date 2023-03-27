package HomeWork4.Pavel;


import HomeWork4.Pavel.list.PavelLinkedList;

public interface PavelList<T> extends Iterable<T> {
    boolean isEmpty();
    T get(int index);


    PavelLinkedList<T> add(T type);

    PavelLinkedList<T> add(int index, T type);

    void addFirst(T t);

    void addLast(T type);

    void remove(int index);
    void removeFirst();
    void removeLast();


    int size();

    void update(int i, T t);
}