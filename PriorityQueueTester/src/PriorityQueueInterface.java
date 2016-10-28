public interface PriorityQueueInterface<E extends Comparable> {
    boolean add(E o);

    boolean offer(E o);

    E poll();

    E remove();

    int size();

    boolean empty();

    void clear();

    E get(int x);

    E set(int x, E item);

    E peek();
}