package package1;

import java.util.Scanner;

public class Program
{
	private static Scanner in;

	public static void main(String[] args)
	{
		System.out.print("������� �����: ");
		in = new Scanner(System.in);
		int number;
		try
		{
			number = Integer.parseInt(in.nextLine());
		}
		catch(NumberFormatException ex)
		{
			System.out.println("��������� ������ ����� ������!");
			return;
		}
		if (number < 1)
		{
			System.out.println("����������, �������� �� ����� �������, �������� ������ ��� ����������� �����");
			return;
		}
		boolean isPrime = true;
		switch (number)
		{
			case 1:
				System.out.println("�������� ����� �� �������� �� �������, �� ���������");
				return;
			case 2:
				System.out.println("������� ������ ������� �����");
				return;
			case 3:
				System.out.println("������� �������� ������� �����");
				return;
			default:
				if (number % 2 == 0)
				{
					System.out.println("������� ������ ��������� �����");
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
			System.out.println("������� �������� ������� �����");
		}
		else
		{
			System.out.println("������� �������� ��������� �����");
		}
	}
}
