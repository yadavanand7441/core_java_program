package com.java.program.collections.sep25.set;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {
        // Different Set Implementations
        Set<String> hashSet = new HashSet<>();          // unordered
        Set<String> linkedHashSet = new LinkedHashSet<>(); // insertion order
        Set<String> treeSet = new TreeSet<>();          // sorted order

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Banana"); // Duplicate will be ignored

        System.out.println("HashSet (unordered): " + hashSet);

        // Adding null (only HashSet and LinkedHashSet allow one null, TreeSet doesn't)
        hashSet.add(null);
        System.out.println("After adding null: " + hashSet);

        // Bulk add
        hashSet.addAll(Arrays.asList("Grapes", "Mango", "Kiwi"));
        System.out.println("After addAll: " + hashSet);

        // Size
        System.out.println("Size of set: " + hashSet.size());

        // Contains
        System.out.println("Contains Mango? " + hashSet.contains("Mango"));

        // Remove single element
        hashSet.remove("Orange");
        System.out.println("After removing Orange: " + hashSet);

        // RemoveAll (removes all elements present in another collection)
        hashSet.removeAll(Arrays.asList("Apple", "Banana"));
        System.out.println("After removeAll (Apple, Banana): " + hashSet);

        // RetainAll (keeps only the common elements)
        hashSet.retainAll(Arrays.asList("Mango", "Kiwi"));
        System.out.println("After retainAll (Mango, Kiwi): " + hashSet);

        // isEmpty
        System.out.println("Is set empty? " + hashSet.isEmpty());

        // Clear (removes all elements)
        hashSet.clear();
        System.out.println("After clear(): " + hashSet);

        // Re-add some elements for iteration demo
        hashSet.addAll(Arrays.asList("Cat", "Dog", "Elephant", "Tiger"));

        // Iterating using for-each loop
        System.out.println("Iterating using for-each:");
        for (String s : hashSet) {
            System.out.println(s);
        }

        // Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Convert to array
        Object[] array = hashSet.toArray();
        System.out.println("Converted to Array: " + Arrays.toString(array));

        // TreeSet (Sorted order)
        treeSet.addAll(Arrays.asList("Banana", "Apple", "Mango", "Kiwi"));
        System.out.println("TreeSet (Sorted): " + treeSet);

        // LinkedHashSet (Preserves insertion order)
        linkedHashSet.addAll(Arrays.asList("One", "Two", "Three", "Four"));
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);
    }
}

