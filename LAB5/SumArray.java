package LAB5;

public class SumArray {
    public int sumTwo(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){count++;}
        }
        return count*5;
    }
}
