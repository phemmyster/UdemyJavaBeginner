package com.collection;

import java.util.ArrayList;

public class CollectionsArrayList {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dont use ArrayList for crud or insert and update data
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Developer");
		ar.add("Manager");
		ar.add("Account");
		ar.add("IT");
		ar.add("QC");

		// to get the 
		//System.out.println(ar.get(0));
		// to delete
		//System.out.println(ar.remove(0));
		// to ahow everything in the arraylist
		for (String st : ar) {
			System.out.println(st);
		}	
			// arraylist for class employee
			
       ArrayList<employee> emp = new ArrayList<employee>();
		emp.add(new employee("Femi", 23));
		emp.add(new employee("Jimoh", 32));
		emp.add(new employee("Grant", 18));
		emp.add(new employee("Abah", 22));
		emp.add(new employee("Niyi",20));
		
		for (employee pple : emp) {
			System.out.println(pple.name +"\t"+pple.age);
			
		}


		}
	
	
	// new class shld be outside out the psvm
		static class employee{
			String name;
			int age;
			
			public employee(String name,int age){
				this.name = name;
				this.age = age;
			}
		}
}
