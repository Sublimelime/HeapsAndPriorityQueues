/*
*Author: Noah Morton
*Date created: 10/16/16, 10:37 AM
*Part of project: PriorityQueueTester
*/

import java.util.ArrayList;

public class MyPrioQueue<E extends Comparable> implements PriorityQueueInterface {

    ArrayList<E> internalQueue = new ArrayList<>();

    @Override
    public boolean add(Comparable o) {
        return false;
    }

    @Override
    public boolean offer(Comparable o) {
        return false;
    }

    @Override
    public Comparable poll() {
        return null;
    }

    @Override
    public Comparable remove() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Comparable get(int x) {
        return null;
    }

    @Override
    public Comparable set(int x, Comparable item) {
        return null;
    }

    @Override
    public Comparable peek() {
        return null;
    }
}
