package package4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Program
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		System.out.println("Введите предложение:");
        System.out.print("> ");
        in = new Scanner(System.in);
        StringBuffer text = new StringBuffer(in.nextLine().toLowerCase());
        System.out.print("Введите слово: ");
        String word = in.nextLine().toLowerCase();
        for (int i = 0; i < text.length();)
        {
            if (Pattern.matches("\\p{IsPunctuation}", Character.toString(text.charAt(i))))
            {
                text = text.deleteCharAt(i);
            }
            else
            {
                ++i;
            }
        }
        int count = 0;
        for (int i = 0; i < text.toString().split(" ").length; ++i)
        {
            if (text.toString().split(" ")[i].equals(word))
            {
                ++count;
            }
        }
        if (count % 10 == 0 || count % 10 == 1 || (count % 10 >= 5 && count % 10 <= 9 || (count % 100 >= 11 && count % 100 <= 19)))
        {
            System.out.println("Слово \"" + word + "\" встречается в тексте " + count + " раз");
        }
        else if (count % 10 >= 2 && count % 10 <= 4)
        {
            System.out.println("Слово \"" + word + "\" встречается в тексте " + count + " раза");
        }
	}
}
