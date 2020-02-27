package rmuti;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int W = kb.nextInt();
        int h = kb.nextInt();
        double H = h/100.0;
        double BMI = W/H;

        System.out.println("BMI = "+BMI);
    }
}
