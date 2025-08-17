package org.example.javacoreandspringpractise.collectionFrmwrk;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class AbstractSeqListEx extends AbstractSequentialList<Integer> {
    private int size;

    public AbstractSeqListEx(int size) {
        this.size = size;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return new ListIterator<Integer>() {
            private int curInd = index;
            @Override
            public boolean hasNext() {
                return curInd<size;
            }

            @Override
            public Integer next() {
                return curInd++;
            }

            @Override
            public boolean hasPrevious() {
                return curInd>0;
            }

            @Override
            public Integer previous() {
                return curInd--;
            }

            @Override
            public int nextIndex() {
                return curInd+1;
            }

            @Override
            public int previousIndex() {
                return curInd-1;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(Integer integer) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void add(Integer integer) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return size;
    }
}
