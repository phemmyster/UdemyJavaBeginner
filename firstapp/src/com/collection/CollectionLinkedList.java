package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<String>();
		 ls.add("Phemmy");
		 ls.add("Debby");
		 ls.add("Niffy");
		 ls.add("Fefe");
		 
		 // to get from linkedlist use iterator from util
		 Iterator<String> itr = ls.iterator();
		 while (itr.hasNext()) {
			//String string = (String) itr.next();
			 System.out.println(itr.next());
			
		}
		 
			 

	}

}
