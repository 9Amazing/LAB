package lab8;


import java.util.ArrayList;

public class ArrayListPriorityQueue {
    ArrayList lst = new ArrayList();

    private int maxIndex() {
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            Comparable d = (Comparable) lst.get(i);
            Object arr = lst.get(max);
            if (d.compareTo(maxIndex()) > 0) {
                max = i;
            }
        }
        return max;
    }
    public void enqueue(Object b){
        lst.add(b);
    }

    @Override
    public String toString() {
        return "ArrayListPriorityQueue{" +
                "lst=" + lst +
                '}';
    }
}



