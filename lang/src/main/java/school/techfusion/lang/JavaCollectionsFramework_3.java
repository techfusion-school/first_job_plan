package school.techfusion.lang;

import java.util.*;

public class JavaCollectionsFramework_3 {

    public static void main(String[] args) {
        // списки
        List<String> strList = new ArrayList<>();

        strList.add("first"); // ~O(1)
        strList.add("second");
        strList.add("third");

        strList.add(3, "prefix"); // O(n)

        strList.subList(1, 2).clear(); // O(n)

        strList.addAll(List.of("end1", "end2")); // O(m)

        strList.remove("first"); // O(n)

        System.out.println("strList result = " + strList);

        // хеш таблица HashSet
        Map<Integer, String> map = new HashMap<>();

        map.put(5, "str"); // O(1)
        map.put(4, "483");

        System.out.println("map.get(4) = " + map.get(4)); // O(1)
        System.out.println("map.get(5) = " + map.containsKey(5)); // O(1)
        System.out.println("map.containsValue(\"483\") = " + map.containsValue("483")); // O(n)

        String newValue = map.compute(4, (key, prev) -> "new value"); // O(1)
        System.out.println("newValue = " + newValue);

        // Зачем нужен hashCode() и equals() ?

        // TreeMap, Map<K, V> с отсортированными ключами
        TreeMap<String, Integer> strToInt = new TreeMap<>();
        strToInt.put("d", 4); // O(log N)
        strToInt.put("abc", 3);
        System.out.println("strToInt = " + strToInt);

        // стек, O(1) ops
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(4);
        stack.push(5);
        System.out.println("stack = " + stack);
        System.out.println("first pop() = " + stack.pop());
        System.out.println("second pop() = " + stack.pop());

        // очередь, O(1) ops
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(3);
        System.out.println("queue = " + queue);

        System.out.println("first poll() = " + queue.poll());
        System.out.println("second poll() = " + queue.poll());

        // Множество HashSet
        Set<String> strSet = new HashSet<>();
        strSet.add("abc"); // O(1)
        strSet.add("bca");

        System.out.println("strSet.contains(\"abc\") = " + strSet.contains("abc")); // O(1)

        strSet.remove("bca"); // O(1)
        System.out.println("strSet.contains(\"bca\") = " + strSet.contains("bca")); // O(1)

        // Множество TreeSet, O(log N) операции, но сортируемость по ключам
        TreeSet<Integer> intTreeSet = new TreeSet<>();
        intTreeSet.add(5); // O(log N)
        intTreeSet.add(4);
        intTreeSet.add(1);

        System.out.println("intTreeSet = " + intTreeSet);
    }
}
