public interface HeapInterface<E extends Comparable>
{
	boolean add(E item);
	boolean insert(E item);
	E remove();
	boolean empty();
	int size();
	E get(int x);
	void clear();
}