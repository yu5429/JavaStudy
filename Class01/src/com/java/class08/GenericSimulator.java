package com.java.class08;

import java.util.HashMap;
import java.util.Map;

public class GenericSimulator {

	public static void main(String[] args) {
		
//		PairObject pair = new PairObject("����1","��");
//		String key = (String) pair.getKey();
//		String value = (String) pair.getValue();
//		
//		Object objk = (Object)"����2";
//		Object objv = "��2233";
//		
//		System.out.println(key);
//		System.out.println(value);
//		
//		System.out.println(objk);
//		System.out.println(objv);
//		
//		PairObject pair2 = new PairObject(1, 2);
//		PairObject pair3 = new PairObject(1.1, 2.1);
//		
//		System.out.println(pair2.getKey());
//		System.out.println(pair2.getValue());
//		System.out.println(pair3.getKey());
//		System.out.println(pair3.getValue());
//		
//		double dbKey = (double)pair3.getKey();
//		double dbValue = (double)pair3.getValue();
//		System.out.println(dbKey);
//		System.out.println(dbValue);
//		
//		PairObject pairAnimal = new PairObject("��",new Animal("������","����"));
//		String strKey = (String)pairAnimal.getKey();
//		Animal aniVal = (Animal)pairAnimal.getValue();
//		System.out.println(strKey);
//		aniVal.bark();
//		
//		PairObject pairAnimal2 = new PairObject("��2", new Dog("������","�ٿ�Ϳ�"));
//		strKey = (String)pairAnimal2.getKey();
//		aniVal = (Animal)pairAnimal2.getValue();
//		
//		System.out.println(strKey);
//		aniVal.bark();
//		
//		Pair<String> pairG = new Pair <>("����3","â��");
//		String genKey = pairG.getKey();
//		String strVal = (String)pairG.getValue();
//		
//		System.out.println(genKey);
//		System.out.println(strVal);
		
		Map<String, String> map = new HashMap<>();
		map.put("����1", "��");
		map.put("����2", "â��");
		map.put("����3", "��3322");
		
		System.out.println(map.get("����1"));
		System.out.println(map.get("����2"));
		System.out.println(map.get("����3"));
		map.put("����3", "��1111");
		System.out.println(map.get("����3"));
	}

}
