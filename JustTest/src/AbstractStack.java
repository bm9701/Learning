/**
 * Created by bm9701 on 26.09.2016.
 */
public abstract class AbstractStack<E> implements Stack<E> {
    protected int size;

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int size() {
        return size;
    }

    public E pop() {
        if(size == 0) {
            return null;
        }
        size--;
        return pop_child();
    }

    protected abstract E pop_child();
}
