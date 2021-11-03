package Animal;

import java.util.HashSet;
import java.util.Iterator;

public class Reptile {
	 HashSet<String> reptile = new HashSet<String>();
	 
	 public  HashSet<String> AddReptile(){
	    System.out.println("HashSet"+"\n");
		System.out.println("Add");

		 reptile.add("Snake");
		 reptile.add("Cocodrile");
		 reptile.add("Turle");
		 reptile.add("Dinosaur"); 
		 reptile.add("Geko");
		 reptile.add("Turle");
	    System.out.println(reptile+"\n");

		return reptile;
	 }
	 
	 public  HashSet<String> RemoveReptile(){
		System.out.println("Remove by the name");
		reptile.remove("Geko");
	    System.out.println(reptile+"\n");

	    System.out.println("Remove and warn if the element doesnt exist");
		reptile.remove("Geko");
	    System.out.println("The element exists: "+reptile.remove("Geko")+"\n");
	    
		return reptile;
	 }
	 

	 public  HashSet<String> IterateReptile(){
		System.out.println("Iterate using iterator");
		Iterator<String> itr = reptile.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + "\n");
        System.out.print( "\n");

		System.out.println("Iterate using a loop");
        for (String s : reptile)
            System.out.print(s + "\n");
		
		return reptile;
	}

}
