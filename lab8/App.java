package lab8;

public class App {
    public static void main(String[] args) {
        ArrayListPriorityQueue arr =new ArrayListPriorityQueue();
        arr.enqueue(new Employee("","","",5,5000));
        arr.enqueue(new Employee("","","",5,6000));
        System.out.println(arr);
    }
}
