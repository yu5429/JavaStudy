package com.java.class08;

public class Animal {
	private String kind;
	private String sound;
	
	public Animal(String kind, String sound) {
		this.kind = kind;
		this.sound = sound;
	}
	
	public void bark() {
		System.out.println(kind+ " "+sound);
	}
	
}
