package class09;

import java.util.HashMap;
import java.util.Map;

public class GenericSimulator {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		System.out.println(map.put("����1", "��"));
		System.out.println(map.put("����2", "â��"));
		System.out.println(map.put("����3", "��3322"));
	
		
		System.out.println(map.get("����1"));
		System.out.println(map.get("����2"));
		System.out.println(map.get("����3"));
		
		System.out.println("--------------");
		System.out.println(map.put("����3", "��1111"));
		System.out.println(map.get("����3"));
		System.out.println(map.toString());
		System.out.println(map.remove("����3"));
		System.out.println(map.get("����3"));
		
	}

}
