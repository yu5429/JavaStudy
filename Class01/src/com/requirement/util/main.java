package com.requirement.util;

public class main {

	public static void main(String[] args) {
		KeyBox<String, String> key = new KeyBox<>();
		System.out.println(key.put("101ȣ","1022"));
		System.out.println(key.get("101ȣ"));
		System.out.println(key.toString());

	}

}
