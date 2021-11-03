package Animal;

import java.util.Iterator;
import java.util.LinkedList;

public class Wild {
    LinkedList<String> animal=new LinkedList<String>();
    
    public LinkedList<String> AddAnimals() {
		System.out.println("LinkedList"+"\n");

		System.out.println("Add");
	   
		animal.add("Lion");
		animal.add("Monkey");
		animal.add("Giraffe");
		animal.add("Tiger");
		animal.add("Zebra");
	    System.out.println(animal+"\n");

		System.out.println("Add an element to the first position");
	    animal.addFirst("Gorilla");
	    System.out.println(animal+"\n");
	    
		System.out.println("Add an element to the last position");
		animal.addLast("Kangoroo");
	    System.out.println(animal+"\n");

		
		System.out.println("Add an element to the 4th position");
		animal.add(3,"Antelope");
	    System.out.println(animal+"\n");

		return animal;
	}
    
	public  LinkedList<String> removeAnimal() {

	    System.out.println("Remove");
		System.out.println("Remove first element");
		animal.removeFirst();
	    System.out.println(animal+"\n");
	    
		System.out.println("Remove last element");
		animal.removeLast();
	    System.out.println(animal+"\n");
	    
		System.out.println("Remove an element to the 2nd position");
		animal.remove(1);
	    System.out.println(animal+"\n");

	    
		return animal;
	}
	
	public  LinkedList<String> UpdateAnimal() {

	    System.out.println("Update");
	    animal.set(0, "I'm impostor");
	    animal.set(4, "I'm impostor too");
	    System.out.println(animal+"\n");

	    
		return animal;
	}
	
	public  LinkedList<String> IterateAnimal() {

		    System.out.println("Iterate");
		    Iterator<String> iterator2=animal.iterator();
		      while(iterator2.hasNext()){
		         System.out.print(iterator2.next()+" ");
		      }

	    
		return animal;
	}
	



}
