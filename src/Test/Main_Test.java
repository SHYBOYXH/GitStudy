package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Average_interface;
import main.Excute;
import main.Max_interface;
import main.Mid_interface;
import main.Sort;
import main.Sort_interface;

class Main_Test {
//不会使用excute中的方法传接口
	@Test
	void test() {
		Excute ex=EasyMock.createMock(Excute.class);
		Excute ex_real=new Excute();
		Sort_interface si=EasyMock.createMock(Sort_interface.class);
		Average_interface ai=EasyMock.createMock(Average_interface.class);
		Mid_interface mid_i=EasyMock.createMock(Mid_interface.class);
		Max_interface mi=EasyMock.createMock(Max_interface.class);
		
//		EasyMock.expect(ex.setAi(ai)).andReturn(ex_real.setAi(ai));
		
		EasyMock.expect(ex.Aver(new int[] {55,2,3,66,52,658,52,5})).andReturn(ex_real.Aver(new int [] {55,2,3,66,52,658,52,5}));
		EasyMock.replay(ex);
		assertArrayEquals(new int[] {111}, ex.Aver(new int [] {55,2,3,66,52,658,52,5}));
	}

}
//Sort_Interface si=EasyMock.createMock(Sort_Interface.class);
//Sort_Interface si_real=new Sort();
//EasyMock.expect(si.sort(new int[] {8,9,2})).andReturn(si_real.sort(new int[] {8,9,2}));
//EasyMock.replay(si);
//assertArrayEquals(new int[] {9,8,2}, si.sort(new int[] {8,9,2}));
