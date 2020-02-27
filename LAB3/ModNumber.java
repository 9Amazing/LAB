package LAB3;

import java.util.Scanner;

public class ModNumber {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        double a=n/5;
        if(a%10==0&&n>1000){
            System.out.println("เงือนไขถูกต้อง");
        }
        else {
            System.out.println("เงือนไขไม่ถูกต้อง");
        }
    }
}
