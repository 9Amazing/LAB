package LAB2;

import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        double km = kb.nextInt();
        double mi = km*0.62137;
        System.out.println(km+" กม. เท่ากับ "+mi+" ไมล์");
    }
}
