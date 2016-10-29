/*
*Author: Noah Morton
*Date created: 10/29/16, 9:32 AM
*Part of project: NoStarvePrioQueue
*/

public class NSPrioQueue<E extends Comparable> extends PrioQueue {
    @Override
    public boolean add(Comparable o) {
        return false;
    }

    @Override
    public boolean offer(Comparable o) {
        return add(o);
    }

    @Override
    public E poll() {
        return null;
    }
}
