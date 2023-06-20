package class09;

public interface Map<K,V> {
	
	public V get(K key);
	public V put(K key, V value);
	public V remove(K key);
	
}
