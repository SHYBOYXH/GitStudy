package main;

public class Excute {
	Average_interface Ai;
	Max_interface Mi;
	Sort_interface Si;
	Mid_interface Mid_i;
	
	private int [] s= {55,2,3,66,52,658,52,5};
	
	public void Sort() {
		Si.Sort(s);
	}
	public int[] Aver(int [] s) {
		return Ai.aver(s);
	}
	public void Max() {
		Mi.print(s);
	}
	
	public void Mid() {
		Mid_i.mul(s);
	}
	
	
	public Average_interface getAi() {
		return Ai;
	}
	public void setAi(Average_interface ai) {
		Ai = ai;
	}
	public Max_interface getMi() {
		return Mi;
	}
	public void setMi(Max_interface mi) {
		Mi = mi;
	}
	public Sort_interface getSi() {
		return Si;
	}
	public void setSi(Sort_interface si) {
		Si = si;
	}
	public Mid_interface getMid_i() {
		return Mid_i;
	}
	public void setMid_i(Mid_interface mid_i) {
		Mid_i = mid_i;
	}
}
