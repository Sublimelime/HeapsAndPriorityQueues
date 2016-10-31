/*
*Author: Noah Morton
*Date created: 10/29/16, 9:32 AM
*Part of project: NoStarvePrioQueue
*/


public class NSPrioQueue<E> extends PrioQueue<PriorityNode<E>> {

    @Override
    public PriorityNode<E> poll() {
        PriorityNode<E> removedVal = super.poll();

        for (int i = 0; i < size(); i++) {
            get(i).setPriority(get(i).getPriority() - 1);
        }
        return removedVal;
    }

    public PriorityNode<E> remove() {
        return poll();
    }
}
