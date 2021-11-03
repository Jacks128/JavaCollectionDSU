package Animal;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Arachnids {
    LinkedHashSet<String> arach = new LinkedHashSet<String>();

    public LinkedHashSet<String> AddArachnids(){
	    System.out.println("\n"+"LinkedHashSet"+"\n");
		System.out.println("Add");
		
		arach.add("Spider");
		arach.add("Scorpion");
		arach.add("Mite");
		arach.add("Tarantula");
		arach.add("Spider");

	    System.out.println(arach+"\n");
		return arach;
    }
    
    public LinkedHashSet<String> RemoveArachnids(){
		System.out.println("Remove by name");
		arach.remove("Tarantula");
		arach.remove("Spider");

		
	    System.out.println(arach+"\n");
		return arach;
    }
    
    
    public LinkedHashSet<String> IterateArachnids(){
		System.out.println("Iterate with loop");
		for (String itr : arach) {
            System.out.println(itr);
        }
        System.out.print( "\n");

		System.out.println("Iterate with iterator");
		Iterator<String> itr = arach.iterator(); 
        
        while (itr.hasNext()){
              System.out.println( itr.next() );
        }
        
        System.out.print( "\n");
		System.out.println("Iterate with foreach");
        arach.stream().forEach(System.out::println);
		return arach;
    }
    
}
