package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Average;

class Aver_Test {

	@Test
	void test() {
		int [] s= {11,11,11,11,11,11};
		Average average_find_real=new Average();
		Average average_find=EasyMock.createMock(Average.class);
		
		EasyMock.expect(average_find.aver(s)).andReturn(average_find_real.aver(s));
		EasyMock.replay(average_find);
		assertArrayEquals(new int[] {11},average_find.aver(s));
	}

}
