package LAB2;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int Sum = (a*a)+(b*b*b)+(c*c*c*c);
        System.out.println(Sum);
    }
}
