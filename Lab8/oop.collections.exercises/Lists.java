package oop.collections.exercises;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        insertFirst(list, 666);
        insertLast(list, 100);
        replace(list, 50);
        removeThird(list);
        removeEvil(list);
        System.out.println(list);
        ArrayList<Integer> newList = generateSquare();
        System.out.println(newList);
        System.out.println(newList.contains(100));
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        copy(list, list2);
        reverse(newList);
        System.out.println(list2);
        System.out.println(newList);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        insertBeginningEnd(linkedList, 5);
        System.out.println(linkedList);
    }

    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0);
        for (int i= list.size()-2; i>-1 ; i--) {
            list.set(i+1, list.get(i));
        }
        list.set(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(3);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        for(int i=0; i<list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(i);
            }
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int i = 1; i<=10; i++) {
            newList.add(i*i);
        }
        return newList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        for(int i=0; i<list.size(); i++) {
            if (list.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        for (int i = 0; i< source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = list.size()-1; i>=0; i--) {
            newList.add(list.get(i));
        }
        for (int i = 0; i< list.size(); i++) {
            list.set(i, newList.get(i));
        }
    }

    public static void reverseManual(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = list.size()-1; i>=0; i--) {
            newList.add(list.get(i));
        }
        for (int i = 0; i< list.size(); i++) {
            list.set(i, newList.get(i));
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
