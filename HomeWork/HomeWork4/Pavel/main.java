package HomeWork4.Pavel;


import HomeWork4.Pavel.list.PavelLinkedList;

public class main {
    public static void main(String[] args) {
        PavelLinkedList<Integer> list = new PavelLinkedList<Integer>();

        list
                .add(2)
                .add(3)
                .add(4);
        list.addFirst(5);
        list.addLast(10);

        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.update(0, 10);
        System.out.println(list);

        System.out.println("Current size: " + list.size());
        System.out.println("El at 0 index: " + list.get(0));

        for (Integer el : list) System.out.println(el);
    }


}
