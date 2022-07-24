package test;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Ibrahima");
		list.add("Mariama");
		list.add("Abdou");
		list.add("Amina");
		
		for (int i = 0; i <list.size(); i++)
		{
			System.out.println("L'element a la position: "+i+" est: "+ list.get(i));
		}
		
		System.out.println("---Une autre maniere de l'afficher---");
		ListIterator li = list.listIterator();
		
		while(li.hasNext())
			System.out.println("=> " + li.next());
		
		System.out.println("\n\n");
		
		while(li.hasPrevious())
			System.out.println("=> " + li.previous());
		
		
	}

}
