package LAB5;

public class DoubleArray {
    int[] copyArray(int[] arr) {
        int[] a = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        return a;

    }

}


