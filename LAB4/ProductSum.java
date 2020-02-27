package LAB4;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = 0;
        int sum=0;
        while (a != -1) {
            a = sr.nextInt();
            if (a != -1) {
                sum =sum+a;
            }
        }
        System.out.println(sum);
    }
}
