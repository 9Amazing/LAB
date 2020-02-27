package lab6;

import java.util.Arrays;

public class Arraylist {
    private Object[] elemantData=new Object[1];
    private int size =0;
    public void add(int x,Object b){
        ensurecapaciy(size+1);
        for (int i=size-1;i>=x;i--){
            elemantData[i+1]=elemantData[i];
        }
        elemantData[x]=b;
        size++;
    }
    public void ensurecapaciy(int x){
        if (x>elemantData.length) {
            Object[] arr=new Object[elemantData.length*2];
            for (int i=0;i<elemantData.length;i++){
                arr[i]=elemantData[i];
            }
            elemantData=arr;
        }
    }
    public void remove(int x){
        for (int i=x;i<size;i++){
            elemantData[i]=elemantData[i+1];
        }
        elemantData[size-1]=null;
        size--;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "Arraylist{" +
                "elemantData=" + Arrays.toString(elemantData) +
                ", size=" + size +
                '}';
    }
}
