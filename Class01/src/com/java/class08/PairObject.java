package com.java.class08;

public class PairObject {
	Object Key;
	Object value;
	
	public PairObject() {
		this(null, null);
	}
	public PairObject(Object key, Object value) {
		this.Key = key;
		this.value = value;
	}
	public Object getKey() {
		return Key;
	}
	public void setKey(Object key) {
		Key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
