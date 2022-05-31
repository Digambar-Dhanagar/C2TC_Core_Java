package com;

public class Arithmetic {
	int d, e, sum, diff, mul, div, mod, inc, dec;
    public void arth() 
    {
d=10; e=20;
	sum = d+e;
	diff = d-e;
	mul = d*e;
	div = d/e;
	mod = d%e;
	inc = ++d;
	dec = --d;
	System.out.println("d+e =  "+sum);
	System.out.println("d-e =  "+diff);
	System.out.println("d*e =  "+mul);
	System.out.println("d/e =  "+div);
	System.out.println("d%e =  "+mod);
	System.out.println("++d =  "+inc);
	System.out.println("—d =  "+dec);
     }

}
