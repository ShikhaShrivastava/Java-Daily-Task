package com.techment.Day9_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("hello.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Employee e=(Employee)ois.readObject();
		System.out.println(e.id);
		System.out.println(e.name);
	}
}
