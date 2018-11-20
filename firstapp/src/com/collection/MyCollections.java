package com.collection;

import java.util.ArrayList;

public class MyCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Developer");
		ar.add("Manager");
		ar.add("Account");
		ar.add("IT");
		ar.add("QC");

		// to get the 
		System.out.println(ar.get(0));
		// to delete
		System.out.println(ar.remove(0));
	}

}
