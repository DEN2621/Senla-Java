package package2;

import java.util.Scanner;

public class Program
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		System.out.print("Введите 2 числа: ");
		in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int gcd, number;
		try
		{
			gcd = Integer.parseInt(input[0]);
			number = Integer.parseInt(input[1]);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Невверный формат ввода данных!");
			return;
		}
        if (number < 0)
        {
            number = -number;
        }
        if (number < gcd)
        {
            for (int i = number; i > 0; i--)
            {
                if ((number % i == 0) & (gcd % i == 0))
                {
                    gcd = i;
                    break;
                }
            }
        }
        else
        {
            for (int i = gcd; i > 0; i--)
            {
                if ((number % i == 0) & (gcd % i == 0))
                {
                    gcd = i;
                    break;
                }
            }
        }
        if (gcd == 1)
        {
            System.out.println("Введённые числа являются взаимно простыми");
            return;
        }
        System.out.println("Наибольший общий делитель чисел равен " + gcd);
        int lcm = Integer.parseInt(input[0]) * Integer.parseInt(input[1]) / gcd;
        System.out.println("Наименьшее общее кратное чисел равно " + lcm);
	}
}
