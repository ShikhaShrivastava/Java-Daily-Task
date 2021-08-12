package com.techment.Day9_IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("abc.txt",true);
		fw.write("hello \n");
		fw.write("world"); //it will override above hello but if i write ("abc.txt", true) it will append 
		fw.write(98);
		System.out.println("Written Successfully..!!");
		fw.close();
	}

}
