package com.collection;

import java.util.HashMap;

public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Phemmy");
		map.put(1, "Debby");
		map.put(1, "Niffy");
		map.put(1, "Fefe");
		map.put(1, "Broz");
		System.out.println(map.get(1));

	}

}
