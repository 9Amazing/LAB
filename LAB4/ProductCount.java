package LAB4;

import java.util.Scanner;

public class ProductCount {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int a = kb.nextInt();
            if (a == -1) {
                break;
            }
            if (a > 10) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
