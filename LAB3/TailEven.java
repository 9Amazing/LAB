package LAB3;

import java.util.Scanner;

public class TailEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = n % 10;
        if (a % 2 == 0) {
            System.out.println("เลขท้ายเป็นคู่");
        } else {
            System.out.println("เลขท้ายเป็นคี่");
        }
        System.out.println(n + "%10 " + "จะได้ " + a);

    }
}
