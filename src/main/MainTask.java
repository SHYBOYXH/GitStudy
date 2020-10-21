package main;

public class MainTask {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average_interface ai=new Average();
		Max_interface mi=new Max();
		Sort_interface si=new Sort();
		Mid_interface mid_i=new Mid();
		
		Excute ex=new Excute();
		ex.setAi(ai);
		ex.setMi(mi);
		ex.setMid_i(mid_i);
		ex.setSi(si);
		
		ex.Sort();
		
	}

}
