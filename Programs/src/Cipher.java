// Heidy Rodriguez
// Programming Fundamentals
// Summer 2021
// Programming Assignment 1 (Cipher)

import java.util.Random;
import java.util.Scanner;

public class Cipher {

	private static Scanner scan;

	public static void main(String[] args) 
	{
		int sum = 0, num = 0; //declaring and initializing variable sum and number
		
		scan = new Scanner(System.in);
		Random rand = new Random(); //instance Random class
	
		
		System.out.println("Programming Fundamentals"); //start message welcome
		System.out.println("NAME: HEIDY");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		for(int i = 0; i < 5; i++) //looping 5 numbers only
		{
			
			if(i == 0)				
			{
				System.out.print("1st number: ");
			
			}
			else if(i == 1)
			{
				System.out.print("2nd number: ");
			
			}
			else if(i == 2)
			{
				System.out.print("3rd number: ");
			
			}
			else if(i == 3)
			{
				System.out.print("4th number: ");
			
			}
			else if(i == 4)
			{
				System.out.print("5th number: ");
			
			}
			
			num = scan.nextInt(); //insert user input please
			
			/* getting 0 and 19 to be inclusive */
			/* update 7/14/2021 19 is inclusive but not 0?  "num = 0" */
			/* update 7/17/2021 able to get 0 inclusive with "num >= 0" */
			if(num >= 0 && num <= 19) 
			{
				sum += num; //add two values and assign result to diff variable "total"
			}
			
			/*instead of writing the same long code 5 times over of 
			 "Please read directions and try again!" and "System.exit(0)"
			 write only once at the end */
			
			else
			{
				System.out.println("Please read directions and try again!"); 
				System.exit(0); //to terminate program 
			
				}
			}
		
		
		
			/* update 7/17/2021 unable to get 0 in the tens place 
			 for the total. need to investigate further */
			System.out.println("Total = " + sum); //print Total
			
		
			
			
			/*going to generate random integer 
			 in range of 0 to 9 (inclusive) */
			int key=rand.nextInt(10);
			System.out.println("Your random key is " +key);
			
			
			
			int onesplace, tensplace;
			tensplace = sum/10;//storing ones and tens of the sum
			onesplace = sum%10; // storing ones and tens
			
			int encoded_onesplace, encoded_tensplace;
			encoded_onesplace = (onesplace + key)%10; //storing encoding ones place
			encoded_tensplace = (tensplace + key)%10; //storing encoding tens place
		
			
			/*to get encoded_tens and encoded_ones to sum 
			 up together to get encoded_number needed */
			int encoded_number = ((encoded_tensplace * 10) + encoded_onesplace);
			
			
			
			
			/*when the encoded number is two numbers then print number as is */
			if (encoded_number > 9)
			{
				System.out.println("Your encoded number is" + encoded_number);
			}
			
			/*encoded number entered is one number only so must
			 add 0 before that entered number to work */
			else
			{
				String encoded = String.format("%02d", encoded_number);
				System.out.println("Your encoded number is" + encoded);
				
			}
		
	}

}
