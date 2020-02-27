package lab7;

import java.util.ArrayList;

public class Queue {
    private ArrayList lst=new ArrayList();
    public void enqueue(Object b){
        lst.add(b);
    }
    public void clear(){
        lst.clear();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "lst=" + lst +
                '}';
    }
}
