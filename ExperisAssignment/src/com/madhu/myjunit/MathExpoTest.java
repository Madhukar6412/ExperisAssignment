/**
 * 
 */
package com.madhu.myjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import org.junit.jupiter.api.Test;

/**
 * @author Madhukar Govindu
 *
 */
public class MathExpoTest 
{
@Test
	public void whenUsingLineNUmberReader_thenReturnTotalNumberOfLines() throws IOException, FileNotFoundException
	{
		
		File INPUT_FILE_NAME = new File("E:/samplefile.txt");
		try(LineNumberReader  reader = new LineNumberReader(new FileReader(INPUT_FILE_NAME )))
		{
			reader.skip(Double.MAX_EXPONENT);
			int noOfLines   =  reader.getLineNumber()+1;
			assertEquals(1.073741824E9, Math.pow(2, 30),noOfLines);		
			
		}
	}

}



