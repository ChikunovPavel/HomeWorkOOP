package HomeWork4.Pavel.list;



import HomeWork4.Pavel.PavelList;

import java.util.Iterator;

public class PavelLinkedList<T> implements PavelList<T> {

    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    public PavelLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> getNode(int i) {
        Node<T> current = head;
        for (int pos = 0; current != null && pos < i; pos++) {
            current = current.next;
        }
        return current;
    }


    @Override
    public T get(int index) {
        if (index < 0 || index >= size) return null;

        return getNode(index).item;
    }


    @Override
    public PavelLinkedList<T> add(T type) {
        addLast(type);
        return this;
    }


    @Override
    public PavelLinkedList<T> add(int index, T type) {
        if (index < 0 || index >= size) return this;

        Node<T> current = getNode(index);
        Node<T> temp = new Node<>(type, current.prev, current);
        current.prev.next = temp;
        current.prev = temp;
        return this;
    }

    @Override
    public void addFirst(T t) {
        Node<T> temp = new Node<>(t);
        if (isEmpty()) tail = temp;
        else head.prev = temp;

        temp.next = head;
        head = temp;
        size++;
    }


    public void addLast(T type) {
        Node<T> temp = new Node<>(type);

        if (isEmpty()) head = temp;
        else tail.next = temp;

        temp.prev = tail;
        tail = temp;
        size++;
    }

    @Override
    public void remove(int index) {
        Node<T> nodeToRemove = getNode(index);
        if (nodeToRemove == null) return;

        if (nodeToRemove != head) nodeToRemove.prev.next = nodeToRemove.next;
        else head = nodeToRemove.next;

        if (nodeToRemove != tail) nodeToRemove.next.prev = nodeToRemove.prev;
        else tail = nodeToRemove.prev;

        nodeToRemove.prev = nodeToRemove.next = null;
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size - 1);
    }


    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator<>(head);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(this.getClass().getSimpleName());

        if (size < 1) return sb.toString();

        sb
                .append(" Size: ")
                .append(size)
                .append(" {");

        for (T el : this) {
            sb.append(el);
            sb.append(el == tail.item ? "}" : ", ");
        }

        return sb.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void update(int i, T t) {
        Node<T> currentNode = getNode(i);
        currentNode.item = t;
    }
}