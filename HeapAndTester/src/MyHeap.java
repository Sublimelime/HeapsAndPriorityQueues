/*
*Author: Noah Morton
*Date created: 10/15/16, 11:04 AM
*Part of project: HeapAndTester
*/

import java.util.ArrayList;

public class MyHeap<E extends Comparable> implements HeapInterface {

    private ArrayList<E> internalHeap;

    public MyHeap() {
        internalHeap = new ArrayList<>();
    }

    @Override
    public boolean add(Comparable item) {
        return insert(item);
    }

    @Override
    public boolean insert(Comparable item) { //todo -write
        return true;
    }

    @Override
    public Comparable remove() { //todo -write
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
    public Comparable get(int x) {
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
}
