package com.techment.withdraw;

import com.techment.deposit.A;

public class D extends A{

	public static void main(String[] args) {
		D obj=new D(); //only public can able to access
		System.out.println(obj.c);
		System.out.println(obj.d);

	}

}
