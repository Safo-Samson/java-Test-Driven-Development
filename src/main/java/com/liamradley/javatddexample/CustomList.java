package com.liamradley.javatddexample;

import java.util.*;

public class CustomList<E> implements List<E> {

    private Object[] underlyingArray;

    public CustomList() {
        // fill in your method here
    }
    public CustomList(E[] array) {
        // fill in your method here
    }

    @Override
    public int size() {
        // fill in your method here
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // fill in your method here
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // fill in your method here
        return false;
    }

    @Override
    public boolean add(E e) {
        // fill in your method here
        return false;
    }

    @Override
    public void clear() {
        // fill in your method here
    }

    @Override
    public Object[] toArray() {
        // fill in your method here
        return null;
    }

    @Override
    public E get(int index) {
        // fill in your method here
        return null;
    }

    @Override
    public int indexOf(Object o) {
        // fill in your method here
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        // fill in your method here
        return false;
    }

    @Override
    public E remove(int index) {
        // fill in your method here
        return null;
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
