package prac_space;

import java.util.Random;

public class _01_ {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[7];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			for(int j=0; j<i; j++]) {
				if(lotto[i] ==lotto[j]) {
					i--;
				}
			}
			
		}
		
		
		
	}

}
