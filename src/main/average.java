package main;

public class average implements Average_interface{
	

    public int [] aver(int [] array) {
        int sum = 0;
        for(int x : array){
            sum += x;
        }
        int a=array.length;
        int s=sum/a;
        return new int [] {s};
    }
}
