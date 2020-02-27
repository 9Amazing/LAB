package LAB4;

import java.util.Scanner;

public class Count3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        String str = "ไม่มีเลข3";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '3') {
                str = "จำนวนประกอบด้วยเลข 3";
            }
        }
        System.out.println(str);

    }
}
