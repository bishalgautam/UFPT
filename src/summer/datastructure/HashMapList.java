package summer.datastructure;

import java.util.ArrayList;
import java.util.HashMap; 

public class HashMapList<T, E> {

	private HashMap<T, ArrayList<E>> map = new HashMap<T, ArrayList<E>>();
	
	public void put(T key, E value){
		if(!map.containsKey(key)){
			map.put(key, new ArrayList<E>());
		}else{
			map.get(key).add(value);
		}
	}
	 	
	public void put(T key, ArrayList<E> items){
		if(!map.containsKey(key)){
			map.put(key, items);
		}else{
			map.get(key).addAll(items);
		}
	}
	
	public ArrayList<E> get(T key){
		return map.get(key);
	}
	
	public boolean contains(T key){
		return map.containsKey(key);
	}
	
	public boolean containsKeyValue(T key, E value){
		ArrayList<E> list = map.get(key);
		if(list == null) return false;
		 return list.contains(key);
	}
	
	@Override 
	public String toString(){
		return map.toString();
	}
	
}
