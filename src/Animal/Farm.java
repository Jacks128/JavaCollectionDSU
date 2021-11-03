package Animal;

import java.util.Enumeration;
import java.util.Vector;

public class Farm {
    Vector<String> fanimal = new Vector<String>(2);
    
    public Vector<String> AddAnimals() {
		System.out.println("Vector"+"\n");
		System.out.println("Add");

    	fanimal.add("Hen");
    	fanimal.add("Chicken");
    	fanimal.add("Pig");
    	fanimal.add("Rabbit");
    	fanimal.add("Cow");
    	fanimal.add("Rooster");
    	System.out.println(fanimal+"\n");
    	
		System.out.println("Add an element to the 2nd and 4th position");
    	fanimal.add(2,"Horse");
    	fanimal.add(4,"Duck");
    	System.out.println(fanimal+"\n");
 	
		return fanimal;
    }
    
    public Vector<String> RemoveAnimals() {
  		System.out.println("Remove by name");
  		fanimal.remove("Hen");
    	System.out.println(fanimal+"\n");
    	
    	System.out.println("Remove by index 4");
  		fanimal.remove(4);
    	System.out.println(fanimal+"\n");
    	
  		return fanimal;
      }
      
    public Vector<String> UpdateAnimals() {
 		System.out.println("Update");
  		fanimal.set(0,"Yellow chicken");
  		fanimal.set(3,"Orange Duck");
    	System.out.println(fanimal+"\n");

 		return fanimal;
     }
     
    
    public Vector<String> IterateAnimals() {
		System.out.println("Iterator");

    	Enumeration<String> en = fanimal.elements();
        while(en.hasMoreElements())
           System.out.print(en.nextElement() + " ");
    	
		return fanimal;
    }
    

}
