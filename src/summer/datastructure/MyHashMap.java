package summer.datastructure;

public class MyHashMap<K,V> {
	
	private Entry[] table;
	private double loadFactor = 0.75;
	private int entryCount;
	
	private static class Entry<K,V>{
		K key;
		V value;
		Entry next;
		
		public Entry(K key, V value){
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
		public Entry getNext() {
			return next;
		}
		public void setNext(Entry next) {
			this.next = next;
		}	
	}
	
	void put(K key, V value){
		
		if (entryCount > loadFactor * table.length) resize();
		int index = hash(key.hashCode()) % table.length;
		Entry<K, V> entry = new Entry<K,V>(key, value);
		
		if(table[index] == null){
			table[index] = entry; 
		}else{
			Entry curr = table[index];
			boolean flag = false;
			while(curr.next != null){
				if(curr.getKey().equals(key)){
					curr.setValue(value);
					flag = true;
					break;
				}
				curr = curr.next;
			}
			if(!flag)
				curr.setNext(new Entry(key, value));
		}
		
		entryCount++;
	}
	
	V get(K key){
		int index = hash( key.hashCode()) % table.length;
		Entry curr = table[index];
		
		while(curr != null){
			if(key.equals(curr.getKey())){
				return (V) curr.getValue();
			}
			curr = curr.next;
		}
			
		return null;
	}
	// create new hash so as to make it robust;
	int hash(int h){
		h ^= (h >>> 20) ^ (h >>>12);
		return h ^ (h>>>7) ^ (h >>> 4);
	}
	// resize when the key-value pair count exceeds table length * load factor 
	void resize(){
		int newSize =   (int) (table.length * 1.5);
		Entry[] newTable = new Entry[newSize];
		Entry[] oldTable = table;
		table = newTable;
		for(int i=0; i < oldTable.length ; i++){
			//newTable[i] = table[i];
			Entry<K,V> temp = oldTable[i];
			put(temp.getKey(), temp.getValue());
		}
		//table = newTable;
	}
	

}
