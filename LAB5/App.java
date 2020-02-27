package LAB5;

public class App {
    public static void main(String[] args) {
      /* DoubleArray a=new DoubleArray();
       int[] b=a.copyArray(new int[]{2,3,4});
       for (int i=0;i<b.length;i++){
           System.out.print(b[i]);
       }*/
       CopyArray A=new CopyArray();
       A.copyFiveFirst(new int[]{0,0,0,0,0},new int[]{2,3,0,8,7,3,5});
        /*CountString A=new CountString();
        int x=A.countM("MMMMM") ;
        System.out.println(x);*/
        /*GenerateArray a=new GenerateArray();
        double[] x=a.gen(4);
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }*/
       /* GenerateArray a=new GenerateArray();
        int[] x=a.gen(3,4);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
        }*/
        /*ShiftArray a=new ShiftArray();
        int[] b=a.shiftRight(new int[]{1,2,3});
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }*/
        /*SumArray a=new SumArray();
        int b=a.sumTwo(new int[]{2,3,5,5});
        System.out.println(b);*/
    }
}
