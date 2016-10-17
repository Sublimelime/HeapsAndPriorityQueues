/*
*Author: Noah Morton
*Date created: 10/15/16, 11:04 AM
*Part of project: HeapAndTester
*/

import java.util.ArrayList;

public class MyHeap<E extends Comparable> implements HeapInterface<E> {

    private ArrayList<E> internalHeap;

    public MyHeap() {
        internalHeap = new ArrayList<>();
    }

    @Override
    public boolean add(E item) {
        return insert(item);
    }

    @Override
    public boolean insert(E item) { //todo -write
        if(empty()) { //if empty, just add it
            internalHeap.add(item);
            return true;
        }else
            internalHeap.add(internalHeap.size(),item); //add the item to the end of the arrayList
        //heapify
        


        return false;
    }

    @Override
    public E remove() { //todo -write
        if (empty())
            return null;

        return null;
    }

    @Override
    public boolean empty() {
        return (internalHeap.size()==0);
    }

    @Override
    public int size() {
        return internalHeap.size();
    }

    @Override
    public E get(int x) {
        return internalHeap.get(x);
    }

    @Override
    public void clear() {
        internalHeap=null;
    }

    @Override
    public String toString() {
        String finalString ="{";
        for (E anInternalHeap : internalHeap) {
            finalString += anInternalHeap + ",";
        }
        finalString+="}";

        return finalString;
    }

    /**
     * Gets the parent index off of an initial index.
     * @param initialIndex the index of the node in question.
     * @return parent index.
     */
    private int parentIndex(int initialIndex) {
        if (initialIndex==0)
            return initialIndex;
        else {
            return (initialIndex-1)/2;
        }
    }

    /**
     * Gets the left child index off of an initial index.
     * @param initialIndex the index of the node in question.
     * @return left child index.
     */
    private int leftChildIndex(int initialIndex) {
        if (initialIndex==0)
            return initialIndex;
        else {
            return (initialIndex*2)+1;
        }
    }

    /**
     * Gets the right child index off of an initial index.
     * @param initialIndex the index of the node in question.
     * @return right child index.
     */
    private int rightChildIndex(int initialIndex) {
        if (initialIndex==0)
            return initialIndex;
        else {
            return (initialIndex*2)+2;
        }
    }

}
