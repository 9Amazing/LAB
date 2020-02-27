package lab7;

import java.util.ArrayList;

public class Stack {
    private ArrayList lst = new ArrayList();

    public void push(Object b) {
        lst.add(b);
    }

    public Object peek() {
        return lst.remove(lst.size() - 1);
    }

    public Object pop() {
        Object Ob = peek();
        lst.remove(lst.size() - 1);
        return Ob;
    }
    public boolean isEmpty(){
        return 0==lst.size();
    }
    public void clear(){
        lst.clear();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "lst=" + lst +
                '}';
    }
}
