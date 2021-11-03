package Animal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hibernating {
	LinkedHashMap<Integer,String> hb = new LinkedHashMap<>();
	
	public LinkedHashMap<Integer,String> addHibernating(){
		System.out.println("LinkedHashMap"+"\n");
		System.out.println("Add");

		hb.put(100, "polar bear");
		hb.put(200, "squirrel");
		hb.put(300, "groundhog");
		hb.put(400, "beaver");
		hb.put(500, "hedgehog");
		
		System.out.println(hb+"\n");

		return hb;
		
	}

	public LinkedHashMap<Integer,String> removeHibernating(){
		System.out.println("Remove by key");
		hb.remove(300);
        System.out.println(hb+"\n");	
		return hb;
		
	}
	
	public LinkedHashMap<Integer,String> iterateHibernating(){
		Set<Entry<Integer, String>> entrySet = hb.entrySet();
		Iterator<Entry<Integer, String>> it = entrySet.iterator();
        Set<Integer> keys = hb.keySet();


        System.out.println("Iterator by iterator : ");
  
        while (it.hasNext())
            System.out.println(it.next());
        
  		System.out.println();
        System.out.println("Iterator by elements of LinkedHashMap : ");

        for (Integer key : keys) {
            System.out.println(key + " -- "+ hb.get(key));
        }
		return hb;
		
	}


}
