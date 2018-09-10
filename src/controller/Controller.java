package controller;

import java.util.Scanner;

public class Controller
{
	public void go()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("how many times have i slacked off?");
		int slack = in.nextInt();
		System.out.println("what is your favorite color?");
		String fav = in.next();
		System.out.println("what is 1 / 2?");
		double answer = in.nextDouble();
		System.out.println("what is your favorite sentence?");
		String sentence = in.nextLine();
		in.close();
		System.out.println("I have slacked off " + slack + " times,");
		System.out.println("your favorite color is " + fav + ",");
		System.out.println("1 / 2 is " + answer + ",");
		System.out.println("and your favorite sentence is " + sentence + ".");
	}

	public boolean validInt(String example)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch (NumberFormatException e)
		{
			System.out.println("Type in a valid int value plz.");
		}
		return isValid;
	}

	public boolean valitDouble(String example)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch (NumberFormatException e)
		{
			System.out.println("Please input a VALID double.");
		}
		return isValid;
	}
}
