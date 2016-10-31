import java.util.ArrayList;

/**
 * Author: Noah Morton
 * Date created: 10/29/2016
 * Part of project: NoStarvePrioQueue
 **/
@SuppressWarnings("CanBeFinal,WeakerAccess")

public class PrioQueue<E extends Comparable> implements PriorityQueueInterface<E> {

    private ArrayList<E> internalQueue;

    public PrioQueue() {
        this.internalQueue = new ArrayList<>();
    }

    @Override
    public void clear() {
        internalQueue = new ArrayList<>();
    }

    @Override
    public E set(int x, E item) {
        return null;
    }

    public boolean add(E o) {
        for (int i = 0; i < internalQueue.size(); i++) {
            if (internalQueue.get(i).compareTo(o) > 0) { //if provided value is smaller or the same as an existing value
                internalQueue.add(i, o);
                return true;
            }
        }
        internalQueue.add(o); //if it can't find a place, add at the end (is bigger than all vals)
        internalQueue.sort(null); //sort for sanity
        return true;
    }

    public boolean offer(E o) {
        return add(o);
    }

    public E peek() {
        return internalQueue.get(0);
    }

    public E poll() {
        return internalQueue.remove(0);
    }


    public E remove() {
        return internalQueue.remove(0);
    }

    public ArrayList<E> getInternalQueue() {
        return internalQueue;
    }

    public boolean empty() {
        return internalQueue.size() == 0;
    }


    public int size() {
        return internalQueue.size();
    }


    public E get(int x) {
        return internalQueue.get(x);
    }
}
