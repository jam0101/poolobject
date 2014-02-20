package ubu.gii.dass.c01;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReusablePoolTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetInstance() {
		ReusablePool instance = ReusablePool.getInstance();
		assertTrue(instance != null);

	}

	@Test(expected = NotFreeInstanceException.class)
	public void testAcquireReusable() {
		ReusablePool reusablePool = ReusablePool.getInstance();
		Reusable r = new Reusable();

		
		try {
			reusablePool.acquireReusable();
			reusablePool.acquireReusable();
			reusablePool.acquireReusable();
			
			
		} catch (NotFreeInstanceException e) {
			System.err.println(e);
		}
		
		
		
		
		
		
	}

	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
