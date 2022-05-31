package com;

public class Bitwise {
    int g, h, and1, or1, xor, neg, leftshift, rightshift;
    public void bit() 
    {
g=10; h=20;
and1 = g &h;
or1 = g |h;
xor = g ^h;
neg = ~ g;
leftshift = h<< g;
rightshift = h>> g;
System.out.println("g&h =  "+and1);
System.out.println("g|h =  "+or1);
System.out.println("g^h =  "+xor);
System.out.println("-g =  "+neg);
System.out.println("h<<g =  "+leftshift);
System.out.println("h>>g =  "+rightshift);
    }

}
