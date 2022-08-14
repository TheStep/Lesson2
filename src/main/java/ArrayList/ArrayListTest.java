package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

    // 2. Реализовать основные методы ArrayList.

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Элемент 1");
        arrayList.add("Элемент 2");
        arrayList.add("Элемент 3");
        arrayList.add("Элемент 4");
        arrayList.add("Элемент 5");
        arrayList.add("Элемент 6");
        System.out.println(arrayList);

        System.out.println(arrayList.get(4));

        arrayList.remove("Элемент 3");
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Элемент 5"));
        System.out.println(arrayList.isEmpty());

    }
}
