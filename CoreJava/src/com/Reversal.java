package com;
import java.util.*;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Original, reverse="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse ");
		Original=in.nextLine();
		int length = Original.length();
		for(int i= length-1;i>=0;i--)
			reverse=reverse+Original.charAt(i);
		System.out.println("Reverse of entered string ="+reverse
				);
		
	}

}
