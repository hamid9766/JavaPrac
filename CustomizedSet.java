package com.section2;

import java.security.Key;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomizedSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Character> set2 = new HashSet<>();
        System.out.println(set1);
        set2.add('a');
        set2.add('b');
        set2.add('c');
        set2.add('d');
        System.out.println( set2);

        Set<Integer> set3 = new HashSet<>();
        set3.add(12);
        set3.add(53);
        set3.add(89);
        System.out.println(set3);

        set3.addAll(set1);
        System.out.println(set3);

        TreeSet<String>  tree = new TreeSet<>();
        tree.add("C#");
        tree.add("java");
        tree.add("C");
        tree.add("Scala");

        //loop printing infinite times
        /*Iterator<String> itr = tree.iterator();
        while (itr.hasNext()){
            System.out.println(tree);
        }*/

        System.out.println(tree);
        TreeSet<Integer> tree1 = new TreeSet<>(set3);
        System.out.println(tree1);

        System.out.println(tree1.remove(53));
        System.out.println(tree1);
        System.out.println(tree1.isEmpty());
        System.out.println(tree1.contains(5));
        System.out.println(tree1.hashCode());
        System.out.println(tree1.comparator());

        //Set to array
        Set<String> set = new HashSet<String>();
        set.add("amazon");
        set.add("facebook");
        set.add("apple");
        set.add("microsoft");
        set.add("twitter");


        Object[] company = set.toArray(); //Use Object[] instead of String or Integer

        for (Object s : company){
        System.out.print(s + " ");
        }

    }
}
