package LAB4;

import java.util.Scanner;

public class PowerCompute {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int i;
        int sum = 0;
        int count = 1;
        for (i = 1; i <= a; i++) {
            count = 5 * count;
        }
        sum = count;
        count = 1;
        for (i = 1; i <= b; i++) {
            count = count * 3;
        }
        sum += count;
        System.out.println(sum);
    }

}

