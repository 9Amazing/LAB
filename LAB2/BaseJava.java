package LAB2;

import java.util.Scanner;

public class BaseJava {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int Num = kb.nextInt();
        int Num2 = kb.nextInt();
        int Sum1 = Num + Num2;
        int Sum2 = Num - Num2;
        int Sum3 = Num * Num2;
        int Sum4 = Num / Num2;
        System.out.println(Sum1);
        System.out.println(Sum2);
        System.out.println(Sum3);
        System.out.println(Sum4);

    }
}
