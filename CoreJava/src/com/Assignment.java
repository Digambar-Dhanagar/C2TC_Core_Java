package com;

public class Assignment {
	int x=10,y=20,z=0;
    public void assign() 
    {
z=x+y;
System.out.println("z= : "+z);
	z+=x;
	System.out.println("z+= : "+z);
	z-=x;
	System.out.println("z-= : "+z);
	z/=x;
	System.out.println("z/=: "+z);
	z%=x;
	System.out.println("z%= : "+z);
	z<<=x;
	System.out.println("z<<= : "+z);
	z>>=x;
	System.out.println("z>>= : "+z);
	z&=x;
	System.out.println("z&=  : "+z);
    }


}
