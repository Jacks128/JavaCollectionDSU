package Animal;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Flying {
	
	TreeMap<Integer,String> fly = new TreeMap<>();

	public TreeMap<Integer,String> addFlying(){
		System.out.println("Treemap"+"\n");

		System.out.println("Add");
		fly.put(4, "Eagle");
		fly.put(5, "Bat");
		fly.put(3, "Owl");
		fly.put(1, "Flamingo");
		fly.put(2, "Bird");
		
        System.out.println(fly+"\n");

		return fly;
		
	}
	
	public TreeMap<Integer,String> removeFlying(){
		System.out.println("Remove by key");
		fly.remove(1);
        System.out.println(fly+"\n");
		 
		System.out.println("Remove the first element");
		fly.pollFirstEntry();
        System.out.println(fly+"\n");
        
		System.out.println("Remove the last element");
		fly.pollLastEntry();
        System.out.println(fly+"\n");
		 

		return fly;
	
	}
	
	public TreeMap<Integer,String> iterateFlying(){
		
		System.out.println("Iterate using ForEach");

		Set<Map.Entry<Integer, String> > entries = fly.entrySet();

        entries.forEach(entry -> {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        });
        
		System.out.println();
		System.out.println("Iterate using for");


    for (Map.Entry<Integer, String> entry : entries) {
        System.out.println(entry.getKey() + "->" + entry.getValue());
    }
		return fly;
		
	}
	
}
