package class09;

import java.util.HashMap;
import java.util.Map;

public class GenericSimulator {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		System.out.println(map.put("¿­¼è1", "Áý"));
		System.out.println(map.put("¿­¼è2", "Ã¢°í"));
		System.out.println(map.put("¿­¼è3", "Â÷3322"));
	
		
		System.out.println(map.get("¿­¼è1"));
		System.out.println(map.get("¿­¼è2"));
		System.out.println(map.get("¿­¼è3"));
		
		System.out.println("--------------");
		System.out.println(map.put("¿­¼è3", "Â÷1111"));
		System.out.println(map.get("¿­¼è3"));
		System.out.println(map.toString());
		System.out.println(map.remove("¿­¼è3"));
		System.out.println(map.get("¿­¼è3"));
		
	}

}
