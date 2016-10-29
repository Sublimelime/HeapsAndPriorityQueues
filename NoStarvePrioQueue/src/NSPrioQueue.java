/*
*Author: Noah Morton
*Date created: 10/29/16, 9:32 AM
*Part of project: NoStarvePrioQueue
*/

public class NSPrioQueue<E> extends PrioQueue<PriorityNode<E>> {
    @Override
    public boolean add(PriorityNode<E> o) {
        return super.add(o);
    }

    @Override
    public boolean offer(PriorityNode<E> o) {
        return super.offer(o);
    }

    @Override
    public PriorityNode<E> poll() {
        PriorityNode removedVal = super.poll();
        //todo calls super.remove(), then lowers every element's prio by 1
        return removedVal;
    }

    public PriorityNode<E> remove() {
        return poll();
    }
}
