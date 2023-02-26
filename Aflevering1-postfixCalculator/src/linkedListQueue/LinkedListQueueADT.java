package linkedListQueue;

import java.util.LinkedList;

public class LinkedListQueueADT<T>  implements ILinkedListADT<T> {

    private final LinkedList<T> linkedList;

    public LinkedListQueueADT() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void push(T element) {

        linkedList.push(element);
    }

    @Override
    public T pop() {
        if (isEmpty())
        {
            throw new NullPointerException();
        }
        return linkedList.pop();
    }

    @Override
    public T peek() {
        if (isEmpty())
        {
            throw  new NullPointerException();
        }
        return linkedList.peek();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
