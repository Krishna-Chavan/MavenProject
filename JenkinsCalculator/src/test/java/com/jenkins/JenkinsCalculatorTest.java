package com.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalculatorTest {

	@Test
	public void addTest() {
		JenkinsCalculator jc = new JenkinsCalculator();
		assertEquals(10,jc.addNumbers(5, 5));
	}
	
	@Test
	public void subTest() {
		JenkinsCalculator jc = new JenkinsCalculator();
		assertEquals(5,jc.subNumbers(10, 5));
	}
}
