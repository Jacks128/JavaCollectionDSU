package Animal;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Sea {
    PriorityQueue<String> sea = new PriorityQueue<String>();
    
    public  PriorityQueue<String> AddSeaAnimal(){
    	System.out.println("PriorityQueue"+"\n");
		System.out.println("Add");
    	sea.add("Fish");
    	sea.add("Shark");
    	sea.add("Starfish");
    	sea.add("Squid");
    	sea.add("Stingray");
    	sea.add("Sea Horse");
    	System.out.println(sea+"\n");
    

    	System.out.println("The top element using Peek");
        System.out.println(sea.peek()+"\n");
        
      
		return sea;
    }
    
    public  PriorityQueue<String> RemoveSeaAnimal(){
		System.out.println("Remove");

    	  System.out.println("Remove by the name");
          sea.remove("Shark");
          System.out.println(sea+"\n");

    	
    	  System.out.println("Remove by the top Element with poll");
    	  sea.poll();
          System.out.println(sea+"\n");
          
		return sea;
    }
    

    
    public  PriorityQueue<String> IterateSeaAnimal(){
		System.out.println("Iterator");
		Iterator<String> it = sea.iterator();

	      
	      while (it.hasNext()) {
	         System.out.println( it.next()); 
	      }
		return sea;
    }

}
