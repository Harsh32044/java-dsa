package com.kunal.collections;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{

    private T[] items = (T[]) new Object[10];
    private int count = 0;

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    public int size() {
        return count;
    }

    public void add(T item) {
        if (items.length > count) {

        items[count++] = item;
        }
        else {
            T[] temp = items;
            items = (T[]) new Object[count * 2];
            for (int i = 0; i < temp.length; i++) {
                items[i] = temp[i];
            }
            items[count++] = item;
        }
    }

    private class ListIterator implements Iterator<T> {

        private GenericList<T> list;
        private int index;
        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
