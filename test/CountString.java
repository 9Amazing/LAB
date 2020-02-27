package test;

public class CountString {
    public int countM(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='M'){
                count++;
            }
        }
        return count;
    }
}
