package main;

import java.util.Arrays;

public class Mid implements Mid_interface {

	@Override
	public int[] mul(int[] array) {
Arrays.sort(array);
		
		int m=array.length/2;
		int mu=0;
		if(array.length%2==0){
			mu=(array[m-1]+array[m])/2;
		}else{
			mu=array[m];
		}
		System.out.println(mu);
		int []s= {mu};
		return s;
	}

	
}
