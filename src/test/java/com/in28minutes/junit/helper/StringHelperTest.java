package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTest {
	
	StringHelper stringHelper= new StringHelper();
	private String input;
	private String expectedOutput;
	
	public StringHelperTest(String input, String expectedOutput) {
		this.input=input;
		this.expectedOutput=expectedOutput;
	}
	
	@Parameters
	public static Collection testConditions(){
		 return Arrays.asList(new Object[][] {
				 {"ABCD","BCD"},
				 {"AACD","CD"},
				 {"CDAA","CDAA"}
		      }); 
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
	}

}
