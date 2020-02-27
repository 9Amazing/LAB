package LAB2;

import java.util.Scanner;

public class CircleCompute {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int r = kb.nextInt();
        double เส้นรอบวง = 2*(3.14*r);
        double พื้นที่วงกลม = (3.14*(r*r));
        System.out.println("เส้นรอบวง = "+เส้นรอบวง);
        System.out.println("พื้นที่วงกลม = "+พื้นที่วงกลม);
    }
}
