package com.liamradley.javatddexample;

import java.util.*;

import ch.qos.logback.core.status.OnConsoleStatusListener;

public class CustomList<E> implements List<E> {

    private Object[] underlyingArray;

    public CustomList() {
        underlyingArray = new Object[0];
        // fill in your method here
        
    }
    public CustomList(E[] array) {
        // fill in your method here
        this.underlyingArray = array;
    
    }

    @Override
    public int size() {
        // fill in your method hexsre
        int l = 0;
        for(int i =0 ;i < underlyingArray.length;i++){
            l++;
        }
        return l;
      // return true;
    }

    @Override
    public boolean isEmpty() {
        // fill in your method here
        if(this.size() == 0){
            return true;
        }
        else{
            return false;
        }

     //   return this.size() == 0 ? true : false
        //return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : underlyingArray) {
            if(object.equals(o)){
                return true;
            }
        }

      return true;
    }

    @Override
    public boolean add(E e) {
        // fill in your method here
        underlyingArray = Arrays.copyOf(underlyingArray,underlyingArray.length+1);
        underlyingArray[underlyingArray.length] = e;
        return true;
    }

    @Override
    public void clear() {
        underlyingArray = new Object[0];
    }

    @Override
    public Object[] toArray() {
        return underlyingArray;
    }

    @Override
    public E get(int index) {
        return (E) underlyingArray[index];
    }

    @Override
    public int indexOf(Object o) {
        int i = 0;
        for(Object obs: underlyingArray){
            i++;
            if(obs.equals(o))
            return i;

        }
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        for (Object object : underlyingArray) {
            if(object.equals(o)){
                object = null;
                return true;
            }
        }
        return false;
        //return false;
    }

    @Override
    public E remove(int index) {
     for(int i =0; i< underlyingArray.length;i++){
        // if(i == index){
        //     return (E) underlyingArray[index];
        //     underlyingArray[index] = null;
        // }
     }
        return null;
    }






























    // Let's not worry about these for now - we're only really worried about the above ones at the moment

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
