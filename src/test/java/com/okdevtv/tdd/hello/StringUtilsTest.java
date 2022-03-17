package com.okdevtv.tdd.hello;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class StringUtilsTest {

	@Test
	public void test() {
		assertEquals("1,000", StringUtils.comma(1000));
		assertEquals("10,000", StringUtils.comma(10000));
		assertEquals("100,000", StringUtils.comma(100000));
		assertEquals("1,200,000", StringUtils.comma(1200000));
	}

	@Test
	public void testException(){
		try{
			new StringUtils();
			fail("Expected exception");
		}catch{
			
		}
	}
}
