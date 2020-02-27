package LAB2;

import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int F = kb.nextInt();
        double C= (F-32)/1.8;
        System.out.println(C);
    }

}
