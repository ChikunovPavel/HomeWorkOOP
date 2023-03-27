package HomeWork4.Pavel.list;


    public class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(T item, Node<T> next, Node<T> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public Node(T item)
        { this(item, null, null); }


    }


