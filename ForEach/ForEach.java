package package1;

import java.util.ArrayList;
import java.util.List;

public class ForEach{  
    public static void main(String[] args) {  
        List<String> nameList = new ArrayList<String>();  
        nameList.add("Arjun");  
        nameList.add("Aditya");  
        nameList.add("Sahil");  
        nameList.add("Deepak");  
        nameList.forEach(System.out::println);  
    }  
}