package class09;

import java.util.ArrayList;

public class HashMap<K,V> implements Map<K,V> {
	
	//�䱸����
	//1.��� �䱸����
	//����, ����, ó��, �м�
	//2.���� �䱸����
	//����, �������̽�, ������, �׽�Ʈ, ����, ǰ��
	//3.�������
	
	//�䱸���� ����
	//1. ����
	// - �䱸���� ����, ���� �ڷ�, ���� ���(�ó�����), ���� Ȱ��
	//2. �м�
	// - �䱸���� �з�, ���� �𵨸�, ��� ���� ����, �䱸���� �Ҵ�, �䱸���� ����
	//3. ��
	// - �ý��� ���Ǽ�, �� ������ �÷���, �䱸���� ����
	//4. Ȯ��
	// - ����, ������Ÿ����, �� ����, �μ� �׽�Ʈ 
	
	
	ArrayList<Pair<K,V>> list = null;
	public HashMap() {
		list = new ArrayList<>();
	}
	
	@Override
	public V get(K key) {
		V value = null;
		Pair<K,V>pair;
		
		for (int i = 0; i < list.size(); i++) {
			pair = list.get(i);
			if (pair.getKey().equals(key)) {
				value = pair.getValue();
			}
		}

		return value;
	}

	@Override
	public V put(K key, V value) {
		
		//��ȯ : ������ΰ� ������ ���� �����ƾ��Ѵ�.
		//�������ΰ� : ������
		
		Pair<K, V> pair = null;
		V rValue = null;
		for(int i=0; i < list.size() ; i++) {
			pair = list.get(i);
			if(pair.getKey().equals(key)) {
				rValue = pair.getValue();
				pair.setValue(value);
				return rValue;
			}
		}
		
		list.add(new Pair<K,V>(key, value));
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
	
	//���� K, V�� �� �� �ִ�.
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
			String str = this.key + "-" + this.value;
			return str;
		}
	}

	
}
