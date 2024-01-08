package exam01.chap05;

import java.util.Iterator;
import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)( Math.random()*45 + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
		}
		
		
		
		
		
		System.out.println("--------------------------");
		
		
		for (int val : lotto) {
			System.out.println(val);
		}
		
		
	}

}
