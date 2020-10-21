package Test;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Mid;

class Test_Mid {

	@Test
	void test() {
		int [] s= {11,22,33,44,55,66,77,88,99};
		Mid mid_find_real=new Mid();
		Mid mid_find=EasyMock.createMock(Mid.class);
		
		EasyMock.expect(mid_find.Mul(s)).andReturn(mid_find_real.Mul(s));
		EasyMock.replay(mid_find);
		assertArrayEquals(new int[] {55},mid_find.Mul(s));
	}

	

}
