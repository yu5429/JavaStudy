package com.java.class08;

public class Pair<K> {
	K key;
	Object value;
	
	public Pair() {
		this(null, null);
	}
	public Pair(K key, Object value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(Object key) {
		key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
