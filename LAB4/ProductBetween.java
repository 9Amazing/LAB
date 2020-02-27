package LAB4;

import java.util.Scanner;

public class ProductBetween {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int i;
        int sum=1;
        for(i=a;i<=b;i++){
            sum=sum*i;
        }
        System.out.println(sum);

    }
}
