import java.util.ArrayList;

/**
 * Author: Noah Morton
 * Date created: 8/26/2016
 * Part of project: QueueTester
 **/
@SuppressWarnings("CanBeFinal,WeakerAccess")

public class PrioQueue<E extends Comparable> implements PriorityQueueInterface<E> {

    private ArrayList<E> queue;

    @Override
    public void clear() {

    }

    @Override
    public E set(int x, E item) {
        return null;
    }

    public PrioQueue() {
        this.queue = new ArrayList<>();
    }

    public boolean add(E o) {
        for (int i = 0; i < queue.size() - 1; i++) {
            if (queue.get(i).compareTo(o) <= 0) { //if value is smaller or the same as an existing value
                queue.add(i, o);
                return true;
            }
        }
        queue.add(o); //if it can't find a place, add at the end (is bigger than all vals)
        return true;
    }

    public boolean offer(E o) {
        return add(o);
    }

    public E peek() {
        return queue.get(0);
    }

    public E element() {
        return null;
    }


    public E poll() {
        return queue.remove(0);
    }


    public E remove() {
        return queue.remove(0);
    }


    public boolean empty() {
        return queue.size() == 0;
    }


    public int size() {
        return queue.size();
    }


    public E get(int x) {
        return queue.get(x);
    }
}
