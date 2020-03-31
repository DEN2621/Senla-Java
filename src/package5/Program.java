package package5;

import java.util.Scanner;

public class Program
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		System.out.print("Введите число: ");
        in = new Scanner(System.in);
        int n = in.nextInt();
        //Я знаю, что N не должно превышать 100 и могу сделать такое ограничение, но это слишком неинтересно ;)
        for (int i = 0; i <= n; ++i)
        {
            String temp = Integer.toString(i);
            boolean isPalindrome = true;
            for (int j = 0; j <= temp.length() / 2; ++j)
            {
                if (temp.charAt(j) != temp.charAt(temp.length() - 1 - j))
                {
                    isPalindrome = false;
                }
            }
            if (isPalindrome)
            {
                System.out.println(i);
            }
        }
	}
}
