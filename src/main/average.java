package main;

public class average {
	public static void main(String[] args) {
        int[] array = {1,2,3,4,5,1,2,8};
        System.out.println(average(array));
    }

    private static double average(int[] array) {
        int sum = 0;
        for(int x : array){
            sum += x;
        }
        return (double)sum/(double)array.length;
    }
}
