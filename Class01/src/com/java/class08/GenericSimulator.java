package com.java.class08;

import java.util.HashMap;
import java.util.Map;

public class GenericSimulator {

	public static void main(String[] args) {
		
//		PairObject pair = new PairObject("¿­¼è1","Áý");
//		String key = (String) pair.getKey();
//		String value = (String) pair.getValue();
//		
//		Object objk = (Object)"¿­¼è2";
//		Object objv = "Â÷2233";
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
//		PairObject pairAnimal = new PairObject("°³",new Animal("°­¾ÆÁö","¿ù¿ù"));
//		String strKey = (String)pairAnimal.getKey();
//		Animal aniVal = (Animal)pairAnimal.getValue();
//		System.out.println(strKey);
//		aniVal.bark();
//		
//		PairObject pairAnimal2 = new PairObject("°³2", new Dog("°­¾ÆÁö","¹Ù¿ì¿Í¿ì"));
//		strKey = (String)pairAnimal2.getKey();
//		aniVal = (Animal)pairAnimal2.getValue();
//		
//		System.out.println(strKey);
//		aniVal.bark();
//		
//		Pair<String> pairG = new Pair <>("¿­¼è3","Ã¢°í");
//		String genKey = pairG.getKey();
//		String strVal = (String)pairG.getValue();
//		
//		System.out.println(genKey);
//		System.out.println(strVal);
		
		Map<String, String> map = new HashMap<>();
		map.put("¿­¼è1", "Áý");
		map.put("¿­¼è2", "Ã¢°í");
		map.put("¿­¼è3", "Â÷3322");
		
		System.out.println(map.get("¿­¼è1"));
		System.out.println(map.get("¿­¼è2"));
		System.out.println(map.get("¿­¼è3"));
		map.put("¿­¼è3", "Â÷1111");
		System.out.println(map.get("¿­¼è3"));
	}

}
