package ITC.algorithms.implemetations_using_array.Stack;
import java.util.Arrays;

public class Stack <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public E pop() {
        E e = (E) elements[--size];
        elements[size] = null;
        return e;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size ;i++) {
            sb.append(elements[i].toString());
            if(i < size-1){
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}