package Animal;

import java.util.HashMap;
import java.util.Map.Entry;

public class Amphibian {
    HashMap<Integer, String> amphi = new HashMap<Integer, String>();
    
    public HashMap<Integer, String> addAmphibian(){
		System.out.println("Hashmap"+"\n");

		System.out.println("Add");
		amphi.put(1, "frog");
		amphi.put(2, "salamander");
		amphi.put(3, "toad");
		amphi.put(4, "triton");
		amphi.put(5, "cecilia");
        System.out.println(amphi+"\n");
		return amphi;
    	
    }
    
    public HashMap<Integer, String> removeAmphibian(){
		System.out.println("Remove by key mapping");
		amphi.remove(3);
		amphi.remove(5);
        System.out.println(amphi+"\n");


		return amphi;
    	
    }
    
    public HashMap<Integer, String> iterateAmphibian(){
		System.out.println("Iterate by entry");
		  for (Entry<Integer, String> entry : amphi.entrySet())
			  System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
      		System.out.println();

			System.out.println("Iterate using keySet()");
	        for (Integer name : amphi.keySet())
	            System.out.println("key: " + name);
        	System.out.println();

	         
			System.out.println("Iterate using values()");
	        for (String url : amphi.values())
	            System.out.println("value: " + url);
		return amphi;
    	
    }
    

}
