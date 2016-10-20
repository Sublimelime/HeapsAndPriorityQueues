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

    @SuppressWarnings("unchecked")
    @Override
    public boolean insert(E item) { //todo -test
        int positionOfNewAdd = internalHeap.size();
        if (empty()) { //if empty, just add it
            internalHeap.add(item);
            return true;
        } else
            internalHeap.add(internalHeap.size(), item); //add the item to the end of the arrayList
        //heapify-up
        if (internalHeap.get(positionOfNewAdd).compareTo(internalHeap.get(parentIndex(positionOfNewAdd))) >= 1) { //if parent is bigger, heapify-up
            do {
                internalHeap.set(positionOfNewAdd, internalHeap.set(parentIndex(positionOfNewAdd), internalHeap.get(positionOfNewAdd)));
                positionOfNewAdd = parentIndex(positionOfNewAdd);
            }
            while (positionOfNewAdd != 0 && internalHeap.get(positionOfNewAdd).compareTo(internalHeap.get(parentIndex(positionOfNewAdd))) >= 1); //continue until at root or parent is smaller
        }
        return true;
    }

    @Override
    public E remove() { //todo -write
        if (empty())
            return null;

        return null;
    }

    @Override
    public boolean empty() {
        return (internalHeap.size() == 0);
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
        internalHeap = new ArrayList<>();
    }

    @Override
    public String toString() {
        if (empty())
            return "Heap is empty.";
        String finalString = "{";
        for (E anInternalHeap : internalHeap) {
            finalString += anInternalHeap + ",";
        }
        finalString += "}";

        return finalString;
    }

    /**
     * Gets the parent index off of an initial index.
     *
     * @param initialIndex the index of the node in question.
     * @return parent index.
     */
    private int parentIndex(int initialIndex) {
        if (initialIndex == 0)
            return initialIndex;
        else {
            return (initialIndex - 1) / 2;
        }
    }

    /**
     * Gets the left child index off of an initial index.
     *
     * @param initialIndex the index of the node in question.
     * @return left child index.
     */
    private int leftChildIndex(int initialIndex) {
        if (initialIndex == 0)
            return initialIndex;
        else {
            return (initialIndex * 2) + 1;
        }
    }

    /**
     * Gets the right child index off of an initial index.
     *
     * @param initialIndex the index of the node in question.
     * @return right child index.
     */
    private int rightChildIndex(int initialIndex) {
        if (initialIndex == 0)
            return initialIndex;
        else {
            return (initialIndex * 2) + 2;
        }
    }

}
