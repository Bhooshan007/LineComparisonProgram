package com.bridgelabz;

public class LineComparisonProgram 
{
	public static void main(String[] args) 
	{
		int x1 = 5;
		int y1 = 6;
		int x2 = 4;
		int y2 = 7;

		double Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of Line is: "+ Length);
				
	}

}
