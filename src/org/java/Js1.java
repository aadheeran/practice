package org.java;

import org.testng.annotations.Test;

public class Js1 extends Js {
    @Test
	public void student() {
		
    	Js2 js2=new Js2(3);
		int a=3;
	data();
	System.out.println(js2.increment());
	System.out.println(js2.decrement());
	
	
	System.out.println(js2.multiplythree());
	}
}
