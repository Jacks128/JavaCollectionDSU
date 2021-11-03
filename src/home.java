

import Animal.Pet;
import Animal.Reptile;
import Animal.Sea;
import Animal.Wild;
import Animal.Amphibian;
import Animal.Arachnids;
import Animal.Crustacean;
import Animal.Farm;
import Animal.Flying;
import Animal.Hibernating;
import Animal.Insect;

public class home {

	public static void main(String[] parametro) {
		//Using ArrayList
        Pet pet =new Pet();
        pet.AssignCode();
        pet.RemoveCode();
        pet.UpdateCode();
        pet.IterateCode();
        
	    System.out.println("\n");
	    System.out.println("\n");

		//Using LinkedList
        Wild wild =new Wild();
        wild.AddAnimals();
        wild.removeAnimal();
        wild.UpdateAnimal();
        wild.IterateAnimal();
        
        System.out.println("\n");
	    System.out.println("\n");
	    
		//Using Vector
	    Farm farm =new Farm();
	    farm.AddAnimals();
	    farm.RemoveAnimals();
	    farm.UpdateAnimals();
	    farm.IterateAnimals();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using Priority Queue
	    Sea sea =new Sea();
	    sea.AddSeaAnimal();
	    sea.RemoveSeaAnimal();
	    sea.IterateSeaAnimal();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using HashSet
	    Reptile reptile = new Reptile();
	    reptile.AddReptile();
	    reptile.RemoveReptile();
	    reptile.IterateReptile();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using LinkedHashSet
	    Arachnids arach=new Arachnids();
	    arach.AddArachnids();
	    arach.RemoveArachnids();
	    arach.IterateArachnids();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using TreeSet
	    Insect ins =new Insect();
	    ins.addInsect();
	    ins.removeInsect();
	    ins.iterateInsect();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using HashTable
	    Crustacean c=new Crustacean();
	    c.putCustacean();
	    c.removeCustacean();
	    c.iterateCustacean();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using Hashmap
	    Amphibian a=new Amphibian();
	    a.addAmphibian();
	    a.removeAmphibian();
	    a.iterateAmphibian();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using Treemap
	    Flying f=new Flying();
	    f.addFlying();
	    f.removeFlying();
	    f.iterateFlying();
	    
	    System.out.println("\n");
	    System.out.println("\n");
	    
		//Using LinkedHashMap
	    Hibernating h=new Hibernating();
	    h.addHibernating();
	    h.removeHibernating();
	    h.iterateHibernating();
    }
}
