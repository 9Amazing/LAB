package LAB4;

import java.util.Scanner;

public class PrimNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = 2;
        while (true) {
            if (k >= n) break;
            if ((n % k) == 0) break;
            k++;
        }
        System.out.println(k == n);
    }
}


