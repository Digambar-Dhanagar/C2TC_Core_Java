package com;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Please choose the number between 1 to 7 to select a music instrument");
		 int instrument=sc.nextInt();
		 String musicInstrument;
		 switch (instrument)
		 {
		 case 1:
		  musicInstrument="Guitar";
		  break;
		 case 2:
		  musicInstrument="Piano";
		  break;
		 case 3:
		  musicInstrument="Drums";
		  break;
		 case 4:
		  musicInstrument="Flute";
		  break;
		 case 5:
		  musicInstrument="Ukelete";
		  break;
		 case 6:
		  musicInstrument="Violin";
		  break;
		 case 7:
		  musicInstrument="Trumpet";
		  break;
		  default:
		   musicInstrument="Invalid";
		   break;
		 }
		System.out.println("you have selected " +musicInstrument);
		 }

	}


