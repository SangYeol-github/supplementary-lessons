package com.tjoeun.chap03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Object> map;
		map = new HashMap<>();
		
		List<String> list;
		List<Map<String,Object>> list1 = new ArrayList<>();
		list1.get(0).get("name"); // Map 원소 1개 한개 리턴
		Map<String,Object> m = new HashMap<>();
		m.put("name", "smith");
		list1.add(m);
		
		for(int i=0; i<list1.size(); i++) {
			String name = list1.get(i).get("name");
			Map<String,Object> map2 = list1.get(i);
			String name1 = map.get("name");
		}

	}

}
