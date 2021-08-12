package com.techment.Day9_IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw= new FileWriter("abc.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(100);  //d
		bw.newLine();
		char[]ch= {'a','b','c','d'};
		bw.write(ch);  //abcd
		bw.newLine();
		bw.write("shikha");  //shikha
		bw.newLine();
		bw.write("Software Developer"); //software developer
		bw.flush();
		bw.close();	
	}
}

//Note-1 : Buffered Reader cannot communicate with file directly instead it make use of file writer to write.