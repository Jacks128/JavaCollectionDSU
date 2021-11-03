package Animal;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Crustacean {
	 Hashtable<Integer, String> crus = new Hashtable<Integer, String>();
	
	 public Hashtable<Integer, String> putCustacean(){
		System.out.println("\n"+"Hashtable"+"\n");

		System.out.println("Add");
		crus.put(10, "Lobster");
        crus.put(15, "Crayfish");
        crus.put(20, "Crab");
        crus.put(25, "Shrimp");
        crus.put(30, "Clam");
        System.out.println(crus+"\n");

		return crus;	 
	 }
	 
	 public Hashtable<Integer, String> removeCustacean(){
			System.out.println("Remove by id");
			crus.remove(20);
			
	        System.out.println(crus+"\n");


			return crus;	 
		 }
	 
	 public Hashtable<Integer, String> updateCustacean(){
			System.out.println("Add");

			return crus;	 
		 }
	 
	 public Hashtable<Integer, String> iterateCustacean(){
			System.out.println("Iterate using getKeys()");

	        Enumeration<Integer> e = crus.keys();
	        while (e.hasMoreElements()) {
	        	 
	            int key = e.nextElement();
	 
	            System.out.println("Id : " + key+ " Crustacean : "+ crus.get(key));
	        }
        	System.out.println();

			System.out.println("Iterate using keySets and storing it into Set");
			Set<Integer> setOfKeys = crus.keySet();

	        for (Integer key : setOfKeys) {
	            System.out.println("Id : " + key+ " Crustacean : "+ crus.get(key));
	        }
	        
		 return crus;	 
	        
	 }
}