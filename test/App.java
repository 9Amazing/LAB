package test;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList();
        int s[] = {1,2,3,4,5,6};
        for (int i  =0;i<5;i++){
            Ar.add(i,s[i]);
        }
        System.out.println(Ar.toString());
        Ar.remove(0);
        System.out.println(Ar.toString());
     }
    }


