package LAB3;

import java.util.Scanner;

public class MostNumber {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        if(a>b&&a>c){
            System.out.println("จำนวนมากที่สุด = "+a);
        }
        if(b>a&&b>c){
            System.out.println("จำนวนมากที่สุด = "+b);
        }
        if (c>a&&c>b){
            System.out.println("จำนวนมากที่สุด = "+c);
        }


    }
}
