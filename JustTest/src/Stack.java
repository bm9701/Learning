/**
 * Created by bm9701 on 26.09.2016.
 */
public interface Stack<E> {
    void push(E o);
    E pop();
    E peek();
    int size();
    boolean isEmpty();
}
