package test;

public class CopyArray {
    public void copyFiveFirst(int arr1[],int arr2[]){
        for (int i=0;i<5;i++){
            arr2[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }
}
