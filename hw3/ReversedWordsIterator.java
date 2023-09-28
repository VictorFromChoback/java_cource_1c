package hw3;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class ReversedWordsIterator<T> implements Iterator<T> {
    
    ArrayList<T> array;
    int index;

    public ReversedWordsIterator(ArrayList<T> array) {
        this.array = array;
        this.index = array.size();
    }

    @Override
    public boolean hasNext() {
        return index != 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        index -= 1;
        return array.get(index);
    }
    
}
