package com.oop.collections.mylist;

public class MyArrayList extends MyAbstractList{
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        Object[] newElements = new Object[elements.length+1];
        for(int i=0; i<index; i++) {
            newElements[i] = elements[i];
        }
        newElements[index] = o;
        for(int i=index+1; i<newElements.length; i++) {
            newElements[i] = elements[i-1];
        }
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size-1);
        return elements[index];
    }

    @Override
    public void remove(int index) {
        Object[] newElements = new Object[elements.length+1];
        for(int i=0; i<index; i++) {
            newElements[i] = elements[i];
        }
        for(int i=index+1; i<elements.length; i++) {
            newElements[i-1] = elements[i];
        }
    }

    @Override
    public int size() {
        return 0;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
