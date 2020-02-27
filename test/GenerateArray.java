package test;

public class GenerateArray {
    public double[] gen(int n) {
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 100;

        }
        return a;
    }
}
