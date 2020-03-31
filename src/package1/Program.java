package package1;

import java.util.Scanner;

public class Program
{
	private static Scanner in;

	public static void main(String[] args)
	{
		System.out.print("Введите число: ");
		in = new Scanner(System.in);
		int number;
		try
		{
			number = Integer.parseInt(in.nextLine());
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Невверный формат ввода данных!");
			return;
		}
		if (number < 1)
		{
			System.out.println("Определить, является ли число простым, возможно только для натуральных чисел");
			return;
		}
		boolean isPrime = true;
		switch (number)
		{
			case 1:
				System.out.println("Введённое число не является ни простым, ни составным");
				return;
			case 2:
				System.out.println("Введено чётное простое число");
				return;
			case 3:
				System.out.println("Введено нечётное простое число");
				return;
			default:
				if (number % 2 == 0)
				{
					System.out.println("Введено чётное составное число");
					return;
				}
				else
				{
					for (int i = 2; i <= Math.sqrt(number); ++i)
					{
						if (number % i == 0)
						{
							isPrime = false;
							break;
						}
						else
						{
							continue;
						}
					}
				}
				break;
		}
		if (isPrime)
		{
			System.out.println("Введено нечётное простое число");
		}
		else
		{
			System.out.println("Введено нечётное составное число");
		}
	}
}
