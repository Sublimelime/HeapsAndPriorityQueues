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
        return queue.add(o);
    }


    public boolean offer(E o) {
        queue.add(queue.size(),o);
        return true;
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
        return queue.size()==0;
    }


    public int size() {
        return queue.size();
    }


    public E get(int x) {
        return queue.get(x);
    }
}
