package dummy;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class login extends Ajay{

	int a,b;
	
	@Before
	public void setUp() throws Exception {
		a=3;
		b=5;
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		int g = methodSum(a, b);
		assertTrue(g == 8);
	}


	@Override
	public int methodSum(int a, int b) {
		return super.methodSum(a, b);
	}

}
