package main;

public class max {
	public void print(int[] array){	
		int Max = array[0];
		for(int i=0;i<array.length;i++){
			if(Max < array[i]) {
				Max = array[i];
			}
		}
		System.out.println("the Max value is "+Max);
	}
}
