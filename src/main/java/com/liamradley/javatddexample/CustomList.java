package com.liamradley.javatddexample;

import java.util.*;

public class CustomList<E> implements List<E> {

    private Object[] underlyingArray;

    public CustomList() {
        underlyingArray = new Object[0];
    }
    public CustomList(E[] array) {
        underlyingArray = array;
    }

    @Override
    public int size() {
        return underlyingArray.length;
    }

    @Override
    public boolean isEmpty() {
        return underlyingArray.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean add(E e) {
        Object[] temp = Arrays.copyOf(underlyingArray, underlyingArray.length + 1);
        temp[underlyingArray.length] = e;
        underlyingArray = temp;
        return true;
    }

    @Override
    public void clear() {
        underlyingArray = new Object[]{};
    }

    @Override
    public Object[] toArray() {
        return underlyingArray;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index > underlyingArray.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) underlyingArray[index];
    }

    @Override
    public int indexOf(Object o) {
        for(int index = 0; index < underlyingArray.length; index++) {
            if(underlyingArray[index].equals(o)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object o) {
        int indexToRemove = indexOf(o);
        if(indexToRemove == -1) {
            return false;
        }
        Object[] temp = new Object[underlyingArray.length - 1];
        int tempCounter = 0;
        for(int index = 0; index <underlyingArray.length; index++) {
            if(index != indexToRemove) {
                temp[tempCounter] = underlyingArray[index];
                tempCounter++;
            }
        }
        underlyingArray = temp;
        return true;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index > underlyingArray.length) {
            return null;
        }
        Object objectToRemove = underlyingArray[index];
        remove(objectToRemove);
        return (E) objectToRemove;
    }


    // Let's not worry about these two for now - we're only really worried about the above ones at the moment

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }
}
