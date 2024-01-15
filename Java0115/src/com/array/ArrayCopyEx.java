package com.array;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String[] arr = {"김하나","이민","김민","박미"};
		
		String[] newArr = new String[arr.length];
		
		for (String str : newArr) {
			System.out.println(str);
		}
		//책 195p
		System.arraycopy(arr, 0 , newArr, 0, newArr.length);//배열이름,어디서부터,배열이름,어디서부터,길이만큼
		for (String str : newArr) {
			System.out.println(str);
		}
		//e더 좋아진 배열복사
		String[] newArr1 = Arrays.copyOf(arr, arr.length);
		for (String str : newArr1) {
			System.out.println(str);
		}
		
	}

}
