package com.techment.Day9_IOStream;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		//File file= new File("abc.txt"); //for path always use double slash
		File file= new File("C:\\Users\\CG-DTE\\eclipse-workspace\\Java Training");
		System.out.println(file.exists());
		//file.createNewFile();
		file.mkdir(); //folder
		System.out.println(file.exists());
	}

}
