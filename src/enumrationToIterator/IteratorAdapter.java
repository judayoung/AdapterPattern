package enumrationToIterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorAdapter implements Iterator {

    private Enumeration enumeration;

    public IteratorAdapter(Enumeration enumeration){
        this.enumeration=enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        // 기존 I/F인 Enumration에 없는 기능이므로, 예외를 던진다.
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        // 기존 I/F인 Enumration에 없는 기능이므로, 예외를 던진다.
        throw new UnsupportedOperationException();
    }
}
