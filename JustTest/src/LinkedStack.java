/**
 * Created by bm9701 on 26.09.2016.
 */
public class LinkedStack<E> extends AbstractStack<E> {
    private Node<E> head;
    /*private int size;

    public int size() {
        return size;
    }*/

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(Node<E> next, E value) {
            this.next = next;
            this.value = value;
        }
    }

    public void push(E element) {
        size++;
        head = new Node<E>(head, element);
    }

    protected E pop_child() {
        final E value = head.value;
        head = head.next;
        return value;
    }

    public E peek() {
        if(head == null) {
            return null;
        }
        return head.value;
    }
}
