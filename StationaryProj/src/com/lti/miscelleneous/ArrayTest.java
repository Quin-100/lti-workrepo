package com.lti.miscelleneous;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		char[] chararr = new char[10];
		int nums[]=new int[10];
		double nums1[]= {25.02 , 12.05 , 45.82 , 50.45 , 16.78 , 45.96 , 20.45 , 47.36 , 98.56};
		for(int i=0 ; i<10 ; i++) {
			chararr[i] = 'a';
			nums[i] = (int)chararr[i];
		}
		
		int a=2;
		System.out.println(a++);
		System.out.println(++a);
	
		    
		
		//for (char c : chararr) {
			System.out.println(Arrays.toString(chararr));
			System.out.println(Arrays.toString(nums));
			Arrays.sort(nums1);
			System.out.println(Arrays.toString(nums1));
		//}
	}

}
