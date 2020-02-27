package lab7;


public class App {
    public static void main(String[] args) {
        Queue h = new Queue();
        h.enqueue(5);
        h.enqueue(6);
        h.enqueue(7);
        h.clear();
        System.out.println(h);
    }
}
