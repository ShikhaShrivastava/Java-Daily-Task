package com.techment.Day9_IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br= new BufferedReader(fr);
		String line= br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}
}
