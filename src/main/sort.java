package main;

public class sort implements Sort_interface{
/*
 * ’≈–°∑…
 * 
 * ≈≈–Ú
 * 
 * */
	
    public int [] Sort (int[] arr) {
   	 for(int j = 0;j < arr.length;j++) {
   		 for(int i = 0;i < arr.length-1;i++)
   		 if(arr[i]<arr[i+1]) {
   			 int temp = arr[i+1];
   			 arr[i+1] = arr[i];
   			 arr[i] =temp;
   		 }
   	 }
   	 for(int j = 0;j < arr.length;j++) {
   		 System.out.print(arr[j]+" ");
    }
   	 return arr;
   }
    
    
}
