/*
*Author: Noah Morton
*Date created: 10/29/16, 9:32 AM
*Part of project: NoStarvePrioQueue
*/

import java.util.ArrayList;

public class NSPrioQueue<E> extends PrioQueue<PriorityNode<E>> {

    private ArrayList<PriorityNode<E>> internalQueue; //todo is this correct

    public NSPrioQueue() {
        this.internalQueue = new ArrayList<>();
    }

    @Override
    public boolean add(PriorityNode<E> o) {

        return false;
    }

    @Override
    public boolean offer(PriorityNode<E> o) {
        return add(o);
    }

    @Override
    public PriorityNode<E> poll() {
        PriorityNode<E> removedVal = super.poll();
        //todo calls super.poll(), then lowers every element's prio by 1 -check
        for (int i = 0; i < internalQueue.size(); i++) {
            internalQueue.get(i).setPriority(internalQueue.get(i).getPriority()-1);
        }
        return removedVal;
    }

    public PriorityNode<E> remove() {
        return poll();
    }
}
