package hw3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class ReverseIterator<T> implements Iterator<T> {
    
    List<T> array;
    int index;

    public ReverseIterator(List<T> array) {
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
