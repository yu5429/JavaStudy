package class09;

import java.util.ArrayList;

public class HashMap<K,V> implements Map<K,V> {
	
	//요구사항
	//1.기능 요구사항
	//수집, 저장, 처리, 분석
	//2.비기능 요구사항
	//성능, 인터페이스, 데이터, 테스트, 보안, 품질
	//3.제약사항
	
	//요구사항 관리
	//1. 도출
	// - 요구사항 수집, 참고 자료, 도출 기법(시나리오), 도출 활동
	//2. 분석
	// - 요구사항 분류, 개념 모델링, 기술 구조 설계, 요구사항 할당, 요구사항 협상
	//3. 명세
	// - 시스템 정의서, 빅 데이터 플랫폼, 요구사항 명세서
	//4. 확인
	// - 검토, 프로토타이핑, 모델 검증, 인수 테스트 
	
	
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
		
		//반환 : 기능적인것 기존의 값을 내놓아야한다.
		//비기능적인것 : 기존값
		
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
	
	//내부 K, V를 볼 수 있다.
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
