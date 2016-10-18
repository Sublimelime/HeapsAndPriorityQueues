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
        int positionOfNewAdd = internalHeap.size();
        System.out.println("Position of new add is initially "+positionOfNewAdd);
        if (empty()) { //if empty, just add it
            internalHeap.add(item);
            return true;
        } else
            internalHeap.add(internalHeap.size(), item); //add the item to the end of the arrayList
        //heapify-up
        if (internalHeap.get(positionOfNewAdd).compareTo(internalHeap.get(parentIndex(positionOfNewAdd))) <= -1) { //if parent is bigger, heapify-up
            do {
               /* E temp = internalHeap.get(positionOfNewAdd); //suspend the value we just added into a variable, and swap them
                System.out.println("Parent index of the new add at pos "+positionOfNewAdd+", is "+parentIndex(positionOfNewAdd));
                System.out.println("Temp is "+temp);
                System.out.println("The object at PONA is "+internalHeap.get(positionOfNewAdd));*/
                internalHeap.set(positionOfNewAdd,internalHeap.set(parentIndex(positionOfNewAdd),internalHeap.get(positionOfNewAdd))); //todo this line is causing issues
                positionOfNewAdd = parentIndex(positionOfNewAdd);
                /*System.out.println("Heap after swap one: "+toString());
                internalHeap.set(parentIndex(positionOfNewAdd), temp);
                System.out.println("Heap after swap two: "+toString());
                positionOfNewAdd--; //adjust the position of the newly added element*/

            } while (positionOfNewAdd != 0 && internalHeap.get(positionOfNewAdd).compareTo(internalHeap.get(parentIndex(positionOfNewAdd))) <= -1); //continue until at root or parent is smaller
        }
        System.out.println("PONA at the end of this is "+positionOfNewAdd);
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
        if(empty())
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
