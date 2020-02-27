package LAB4;

import java.util.Scanner;

public class CountDivideBy3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int i;
        int count=0;
        for (i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
