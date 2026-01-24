//Java program to find number of digits in an integer

class CountDigit{	    
public static void main(String[] args)
	{
		int number = 12345;

		//declare a variable to count number of digits
		int digit = 0;
		while(number != 0)
		{
			//pick last digit of the number and count one by one
			digit++;
			number = number / 10;
		}

		//display number of digits
		System.out.print("Number of Digits = "+digit);

	}
}
