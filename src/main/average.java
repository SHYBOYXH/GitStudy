package main;

public class average implements Average_interface{
	
/*
 * 于虎
 * 
 * 平均数
 * 
 * */
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
