package java8.prowings.practice;

import java.util.Arrays;
public class Array5 {
	
	public static void main(String[] args) {
		
		int[] x = {10,50,90,40,100,60,80,70,20,30};
		
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println("Second Highest Number in array is :  "+x[x.length-2]);
		
		int i,j = 0;
		int temp;
		for(i=0;i<x.length;i++) {
			for(j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println("Second Highest Number in array is :  "+x[x.length-2]);
	}

	

}
