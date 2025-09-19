package example.example02;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Sample<T> implements ISample<T> {
    private T[] array;

    public Sample() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addElement(T t, int index) {
        array[index] = t;
    }

    @Override
    public T getElement(int index) {
        return array[index];
    }
}
