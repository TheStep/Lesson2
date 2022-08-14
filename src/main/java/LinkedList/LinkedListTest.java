package LinkedList;

import java.util.LinkedList;

public class LinkedListTest {

    // 1. Реализовать основные методы связанного списка.

    public static void main(String[] args) {
        LinkedList<String> test = new LinkedList<>();

        test.add("Элемент 1");
        test.add("Элемент 2");
        test.add("Элемент 3");
        test.add("Элемент 4");
        test.add("Элемент 5");
        test.add("Элемент 6");

        System.out.println(test);

        test.remove("Элемент 3");
        System.out.println(test);

        test.add(2, "Элемент 3");
        System.out.println(test);

        test.add(3, "Элемент 4");
        System.out.println(test);

        System.out.println(test.get(5));
        System.out.println(test.getFirst());
        System.out.println(test.getLast());

        test.removeLast();
        System.out.println(test);

        test.removeFirst();
        System.out.println(test);

        System.out.println(test.size());

        test.addLast("Последний элемент");
        test.addFirst("Первый элемент");
        System.out.println(test);

        System.out.println(test.isEmpty());

        System.out.println(test.contains("Элемент 4"));

    }
}
