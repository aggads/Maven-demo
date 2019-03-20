package com.codebind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.*;

//import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
//	@Before
//	public void AddBefore(){
//		System.out.println("\n -------------------");
//	}
/*	@After
	public void AddFailded(){
		System.out.println("\n -------------------");
	}*/
	@Test
	public void Addtest(){
		try {
			App junit = new App();
			int result = junit.add(100, 200);
			assertEquals(300, result);
			System.out.println("\n Add Done !\n");
			System.out.println("\n -------------------");			 
		} catch(Exception e) {
			fail("Expected an IndexOutOfBoundsException to be thrown");
			e.printStackTrace();
//			System.out.println("\n Add Failed !\n");
		} 
	}

	@Test
	public void Concattest() {
		try {
			App junit = new App();
			String result = junit.Concat("Hello", "World");
			assertEquals("HelloWorld", result);
			System.out.println("\n Concat Done !\n");
			System.out.println("\n -------------------");
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("\n Concat Failed !\n");
		} 
	}

}
