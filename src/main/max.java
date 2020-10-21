package main;

public class max implements Max_interface{
	public int[] print(int[] array){	
		int Max = array[0];
		for(int i=0;i<array.length;i++){
			if(Max < array[i]) {
				Max = array[i];
			}
		}
		return new int[] {Max};
	}
}
