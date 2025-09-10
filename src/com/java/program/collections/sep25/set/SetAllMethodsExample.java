package com.java.program.collections.sep25.set;

import java.util.*;

public class SetAllMethodsExample {
    public static void main(String[] args) {
        // Create a Set
        Set<String> set = new HashSet<>();

        // 1. add(E e) -> add single element
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("After add: " + set);

        // 2. addAll(Collection<? extends E> c) -> add multiple
        set.addAll(Arrays.asList("Mango", "Grapes", "Kiwi"));
        System.out.println("After addAll: " + set);

        // 3. contains(Object o) -> check if element exists
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // 4. containsAll(Collection<?> c)
        System.out.println("ContainsAll (Apple, Kiwi)? " + set.containsAll(Arrays.asList("Apple", "Kiwi")));

        // 5. size()
        System.out.println("Size of set: " + set.size());

        // 6. isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());

        // 7. iterator()
        System.out.print("Iterating using Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 8. toArray()
        Object[] arr1 = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr1));

        // 9. toArray(T[] a)
        String[] arr2 = set.toArray(new String[0]);
        System.out.println("toArray(T[] a): " + Arrays.toString(arr2));

        // 10. remove(Object o)
        set.remove("Apple");
        System.out.println("After remove(Apple): " + set);

        // 11. removeAll(Collection<?> c)
        set.removeAll(Arrays.asList("Banana", "Mango"));
        System.out.println("After removeAll(Banana, Mango): " + set);

        // 12. retainAll(Collection<?> c)
        set.retainAll(Arrays.asList("Grapes", "Orange"));
        System.out.println("After retainAll(Grapes, Orange): " + set);

        // 13. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // Re-add for next examples
        set.addAll(Arrays.asList("One", "Two", "Three"));
        System.out.println("Re-added: " + set);

        // 14. equals(Object o)
        Set<String> anotherSet = new HashSet<>(Arrays.asList("One", "Two", "Three"));
        System.out.println("Equals anotherSet? " + set.equals(anotherSet));

        // 15. hashCode()
        System.out.println("HashCode of set: " + set.hashCode());

        // 16. spliterator()
        System.out.print("Spliterator forEachRemaining: ");
        Spliterator<String> spliterator = set.spliterator();
        spliterator.forEachRemaining(e -> System.out.print(e + " "));
    }
}

