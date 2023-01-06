package oop.collections.exercises;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(0);
        setA.add(1);
        setA.add(2);
        Set<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(2);
        setB.add(3);
        Set<Integer> newSet = intersectionManual(setA, setB);
        System.out.println(newSet);
        Set<Integer> newSet2 = unionManual(setA, setB);
        System.out.println(newSet2);
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> newList = removeDuplicatesManual(list);
        System.out.println(newList);
        String a = firstRecurringCharacter("abc");
        System.out.println(a);
        Set<Character> SetChar = new HashSet<Character>();
        SetChar = allRecurringChars("abc");
        System.out.println(SetChar);
        Integer[] arr = toArray(setA);
        for (int i =0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        TreeSet<Integer> newTree = new TreeSet<>();
        newTree.addAll(setA);
        System.out.println(getFirst(newTree));
        System.out.println(getGreater(newTree, 0));
    }

    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>();
        for(int element : first) {
            for(int element2 : second) {
                if(element == element2) {
                    newSet.add(element);
                }
            }
        }
        return newSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<Integer>();
        for(int element : first) {
            newSet.add(element);
        }
        for(int element : second) {
            newSet.add(element);
        }
        return newSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<Integer>(first);
        newSet.retainAll(second);
        return newSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<Integer>(first);
        newSet.addAll(second);
        return newSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(source);
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        List<Integer> newList = new ArrayList<>(new HashSet<>(source));
        return newList;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i< source.size(); i++) {
            int count  = 0;
            for (int j = i+1; j < source.size()-1; j++)
            {
                if(source.get(i) == source.get(j))
                {
                    count += 1;
                }
            }
            if(count == 0) {
                list.add(source.get(i));
            }
        }
        return list;
    }

    public static String firstRecurringCharacter(String s) {
        String str = "";
        str += s.charAt(0);
        return str;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> newSet = new HashSet<Character>();
        for (int i = 0; i<s.length(); i++) {
            newSet.add(s.charAt(i));
        }
        return newSet;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] newArray = new Integer[source.size()];
        int i=0;
        for (int element : source) {
            newArray[i] = element;
            i+=1;
        }
        return newArray;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
