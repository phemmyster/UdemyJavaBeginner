package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Phemmy");
		map.put(2, "Debby");
		map.put(3, "Niffy");
		map.put(4, "Fefe");
		map.put(5, "Broz");
		System.out.println(map.get(4));
		
		for (Map.Entry m: map.entrySet()) {
			
			System.out.println("Key: "+m.getKey() + ", value: "+m.getValue());
		}
		map.put(1, "Phemmy Akinz");
		System.out.println(map.get(1));
	}

}
