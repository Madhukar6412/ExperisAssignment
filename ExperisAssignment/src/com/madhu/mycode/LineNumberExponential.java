/**
 * 
 */
package com.madhu.mycode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author Madhukar Govindu
 *
 */
public class LineNumberExponential {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("E:/samplefile.txt");
		if(file.exists())
		{
			try {
				FileReader fread = new FileReader(file);
				LineNumberReader lnr = new LineNumberReader(fread);
				try
				{
					while(lnr.readLine()!=null)
					{
					}
					System.out.println(  "Total number of lines in a file"  +  Math.pow(2, 30));
				}
				
				catch(IOException e)
				{
					e.printStackTrace();
				}			
			}
			catch(FileNotFoundException e)
			{
			e.printStackTrace();	
			}  		}  	} 
            }

		


	