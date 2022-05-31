package com;

public class Logical {
    boolean and, or, not;
    boolean a = true;
    boolean b = true;
    public void log() 
    {
and = a&&b;
or = a||b;
not = !a;
System.out.println("a&&b =  "+and);
System.out.println("a||b =  "+or);
System.out.println("!a =  "+not);
    }

}
