package LAB3;

import java.util.Scanner;

public class ComputeABS {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a =kb.nextInt();
        int b =kb.nextInt();
        int abs = a-b;
        if(abs <0){
            abs=abs*(-1);

        }
        System.out.println("ค่าสมบรูณ์="+abs);
    }
}
