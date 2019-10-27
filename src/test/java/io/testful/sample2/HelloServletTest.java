package io.testful.sample2;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.testful.junit.TestfulConfig;
import io.testful.junit.TestfulJunitRunner;

@RunWith(TestfulJunitRunner.class)
@TestfulConfig()
public class HelloServletTest {

	@Test
	public void test_register() {
		
		System.out.println("TESTE");
		
		
	}
	
}
