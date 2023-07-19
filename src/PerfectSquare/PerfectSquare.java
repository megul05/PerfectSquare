package PerfectSquare;

import java.util.*;

public class PerfectSquare {
	
	public static boolean square(int number)
	{
		for(int i=0;i<number;i++)
		{
			if(i*i ==  number)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean print = square(number);
		System.out.println(print);

	}

}
