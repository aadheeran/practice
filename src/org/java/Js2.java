package org.java;

public class Js2 extends Js3 {
	
	int a;
	public Js2(int a) {
        super(a);
		this.a=a;

	}
	public int increment() {
		
		a=a+1;
		return a;
	}
    public int decrement() {
    	a=a-1;
		return a;
    	
    }
}
