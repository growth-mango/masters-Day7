package Day7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack {
    private LinkedList<Integer> stack = new LinkedList<>(Arrays.asList(1,3,5));
    private final int CAPACITY = 8;

    public void pushValue(Integer value) {
        if (stack.size() < CAPACITY) {
            stack.push(value);
        } else {
            throw new IllegalStateException("OVERFLOW")
        }
    }

    public Integer popValue() {
        try { // 일단 한 번은 실행
            return stack.pop();
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("EMPTY");
        }
    }

    public Integer peekValue() {
        try {
            return stack.peek();
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("EMPTY");
        }
    }



}
