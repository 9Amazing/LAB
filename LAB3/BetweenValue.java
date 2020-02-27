package LAB3;

import java.util.Scanner;

public class BetweenValue {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        if(10<a&&100>a){
            System.out.println("ค่าอยู่ระหว่าง 10 ถึง 100");
        }
        else {
            System.out.println("อยู่นอกเงือนไข");
        }
    }
}
