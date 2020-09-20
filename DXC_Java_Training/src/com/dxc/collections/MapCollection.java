package com.dxc.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollection {

	public static void main(String[] args) {
		
		Map<String,Integer>  map =	new HashMap<String,Integer>();
		
		map.put("DRDO", 1);
		map.put("ISRO", 2);
		map.put("IAF", 3);
		map.put("HAL", 4);
		map.put("BHEL", 5);
		
		System.out.println(map);
	
		Set<String> set = map.keySet();
		
		map.values();
		
		Iterator<String> iterator =set.iterator();
		
		while (iterator.hasNext()) {
			
			String key =  iterator.next();
			Integer value =	map.get(key);
			
			System.out.println(value + " : " + key);
		}
	}
}
