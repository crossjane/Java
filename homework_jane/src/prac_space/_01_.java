package prac_space;

import java.util.Map;

public class _01_ {
	

	public static <K,V> K getMaxMap(Map<K,V> map) {
		K maxKey = null;
		V maxValue = null; 
		
		int index = 0 ; 
		
		for(Map.Entry<K, V> entry : map.entrySet()) {
			if(index == 0 ) {
				maxKey = entry.getKey();
				maxValue = entry.getValue();
				
			}else {
				if((int)entry.getValue() > (int)maxValue) {
					maxKey = entry.getKey();
					maxValue = entry.getValue();
				}
			}index++;
			
		}return maxKey;
	}
		
	}
	
	

	
