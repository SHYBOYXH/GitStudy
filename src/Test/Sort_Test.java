package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Sort;

class Sort_Test {

	@Test
	void test() {
		int [] s= {11,22,33,44,66,55,77,88,99};
		Sort sort_find_real=new Sort();
		Sort sort_find=EasyMock.createMock(Sort.class);
		
		EasyMock.expect(sort_find.Sort(s)).andReturn(sort_find_real.Sort(s));
		EasyMock.replay(sort_find);
		assertArrayEquals(new int[] {99,88,77,66,55,44,33,22,11},sort_find.Sort(s));
	}

}
