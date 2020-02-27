package LAB5;

public class ShiftArray {
    int [] shiftRight(int arr[]){
        int x[]=new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            x[i+1]=arr[i];
        }
        return x;
    }
}
