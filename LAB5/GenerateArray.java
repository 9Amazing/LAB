package LAB5;


public class GenerateArray {
    // ข้อ 2
    double[] gen(int n) {
        double[] r = new double[n];
        for (int i = 0; i < r.length; i++) {
            r[i] = Math.random()*100;

        }
        return r;
    }

    //ข้อ 7
    int[] gen(int n, int i) {
        int[] a = new int[n];
        for (int b = 0; b < n; b++) {
            a[b] = i;
        }
        return a;
    }
}

