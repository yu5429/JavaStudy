package com.requirement.util;

import java.util.ArrayList;

/* @param <E> the type of elements in this list
 * 
 * @author Josh Bloch
 * @author Neal Gafter
 * @see Collection
 * @see List
 * @see LinkedList
 * @see Vector
 * @since 1.2
 */

public class KeyBox<K,V> implements key<K,V>  {
	
	
	ArrayList<Pair<K,V>> list = null;
	public KeyBox() {
		list = new ArrayList<>();
	}
	
	@Override
	public V get(K key) {
		V value = null;
		Pair<K, V> pair;

		try {
			for (int i = 0; i < list.size(); i++) {
				pair = list.get(i);
				if (pair.getKey().equals(key)) {
					value = pair.getValue();
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return value;
	}

	@Override
	public V put(K key, V value) {
		Pair<K, V> pair = null;
		V rValue = null;

		try {
			for (int i = 0; i < list.size(); i++) {
				pair = list.get(i);
				if (pair.getKey().equals(key)) {
					rValue = pair.getValue();
					pair.setValue(value);
					return rValue;
				}
			}
			list.add(new Pair<K, V>(key, value));
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;
	}

	@Override
	public V remove(K key) {
		Pair<K, V> pair = null;
		V rValue = null;
		
		for (int i = 0; i < list.size(); i++) {
			pair = list.get(i);
	        if (pair.getKey().equals(key)) {
	        	rValue = pair.getValue(); 
	            list.remove(i);
	            return rValue;
	        }
	    }
		return null;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}

	private class Pair<K,V>{
		private K key;
		private V value;
		
		Pair(K key, V value){
			this.key = key;
			this.value = value;
		}
		
		K getKey() {
			return this.key;
		}
		
		V getValue() {
			return this.value;
		}
		
		void setKey(K key) {
			this.key = key;
		}
		void setValue(V value) {
			this.value = value;
		}

		@Override
		public String toString() {
			System.out.println("µø¿€");
			return this.key+"-"+this.value;
		}
		
	}
}
