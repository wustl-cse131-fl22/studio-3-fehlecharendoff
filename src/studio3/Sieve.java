package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int largestNum = in.nextInt();
		boolean[] allNum = new boolean [largestNum];
		//int element = 0;
	
		for (int i = 0; i <largestNum; i++)
		{
			allNum[i]= true;
		
		}
		
		for (int j = 2; j*j<largestNum; j++)
		{
			if (allNum[j]==true)
			{
				for(int i = j*j; i<largestNum; i+=j)
				{
			allNum[i] = false;
			
				}
			}
	
		}
		for (int i = 2; i <largestNum; i++)
		{		
			if(allNum[i]==true)
		{
		System.out.println(i);
		}
	}
	}

}
