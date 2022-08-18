package package1;

import java.util.ArrayList;
import java.util.List;

public class ForEach{  
	 public static void main(String[] args) {  
	        List<String> namesList = new ArrayList<String>();  
	        namesList.add("Aditya");  
	        namesList.add("Arjun");  
	        namesList.add("Ronit");  
	        namesList.add("Deepak");  
	        namesList.forEach(names -> System.out.println(names));  
	          
	    }  
}
