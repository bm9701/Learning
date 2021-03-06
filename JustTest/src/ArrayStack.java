/**
 * Created by bm9701 on 26.09.2016.
 */
public class ArrayStack extends AbstractStack {
    private Object[] elements = new Object[0];
    /*private int size;

    public int size() {
        return size;
    }*/

    public void push(Object value) {
        ensureCapacity(size+1);
        elements[size++] = value;
    }

    public void ensureCapacity(int capacity) {
        if(elements.length >= capacity) {
            return;
        }
        Object[] newElements = new Object[capacity*2];
        for(int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    protected Object pop_child() {
        /*if(size == 0) {
            return null;
        }*/
        return elements[size];
    }

    public Object peek() {
        if(size == 0) {
            return null;
        }
        return elements[size - 1];
    }
}
