package com.practice;

import java.util.Arrays;

        public class Remove_Element {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {10,20,30,25,35,55};
		
		int[] arr1=new int[arr.length-1];
		
		int removeelement=30;
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			
		if(arr[i]==removeelement) {
		continue;
		}
		arr1[index]=arr[i];
		index++;
		}
		
		System.out.println(Arrays.toString(arr1));
		
	

	}

}
