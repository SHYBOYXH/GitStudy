package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.max;

class Max_test {

	@Test
	void test() {
		int [] s= {11,22,33,44,55,66,77,88,99};
		max max_find_real=new max();
		max max_find=EasyMock.createMock(max.class);
		
		EasyMock.expect(max_find.print(s)).andReturn(max_find_real.print(s));
		EasyMock.replay(max_find);
		assertArrayEquals(new int[] {99},max_find.print(s));
	}

}
