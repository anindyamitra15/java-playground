package com.anindya.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnLists {

    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    public void demonstrateArrayList() {
        System.out.print("Empty List: ");
        System.out.println(arrayList);

        System.out.print("Appending few elements to the list one by one: ");
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);

        System.out.println("Size of the list: " + arrayList.size());

        System.out.print("Adding element by specifying index: ");
        arrayList.add((arrayList.size() - 1), 8);
        System.out.println(arrayList);

        System.out
                .println("Note that .add() doesn't "
                        + "update the existing elements and pushes "
                        + "the element at that index to make room "
                        + "for the element to be added");

        System.out.println("Accessing an element at a particular index = 1 : " + arrayList.get(1));

        System.out.println("Finding index (4 exists): " + arrayList.indexOf(Integer.valueOf(4)));
        System.out.println("Finding index (50 doesn't exist): " + arrayList.indexOf(Integer.valueOf(50)));

        System.out.println("Checking if list contains '4' or not: " + arrayList.contains(Integer.valueOf(4)));

        System.out.print("For Each with Lambdas: ");
        arrayList.forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.print("Using Iterator to access element: ");
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("Removing one element");
        arrayList.remove(Integer.valueOf(4));
        System.out.println(arrayList);

        System.out.print("Clearing the list: ");
        arrayList.clear();
        System.out.println(arrayList);
    }
}
