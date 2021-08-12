package com.techment.Day7;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s1= new Stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		System.out.println("element innstack is: "+s1);
		s1.pop();
		System.out.println("After removing: "+s1);
	}

}
