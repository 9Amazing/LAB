package lab10;



import java.util.*;

public class test {
    public static void main(String[] args) {

        Map<String,Product> map = new HashMap<String,Product>();
        map.put("a",new Product("s","s","s",123));
        map.put("b",new Product("s","s","s",123));
        map.put("c",new Product("s","s","s",123));
        System.out.println(map);


    }
}
