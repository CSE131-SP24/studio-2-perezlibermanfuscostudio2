package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your win Probability?");
		double winProbability = in.nextDouble();
		System.out.println("What is your win Limit?");
		double winLimit = in.nextDouble();
		
		double winProb = Math.random();
		
		while (startAmount<winLimit && startAmount>0)   {
			}
			if (winProb >= winProbability)
		{
			startAmount += 1;
			System.out.println(startAmount);
		} else {
			startAmount -= 1;
			System.out.println(startAmount);
		}
			
		if (startAmount == winLimit) {
            System.out.println("Win!");
		} else {
			startAmount = 0;
			System.out.println("Ruin!");
		
		}   
        }
	}


