package quiz2;

import java.util.Scanner;


public class tuition {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("enter an increasing rate:(0-1)");
		double rate =input.nextDouble();
		System.out.print("enter an initial tuition fee:(our school is 12342)");
		double tuition=input.nextDouble();
	
			double sum=0.0;
			for(int year=1;year<=4;year++)
			{
			    tuition+=(tuition*rate);
			    sum+=tuition;
			}
			   System.out.printf("The tuition for the four years is:%.2f\n",sum);
			}
	}	

