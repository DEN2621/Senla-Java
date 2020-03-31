package package3;

import java.util.Arrays;
import java.util.Scanner;

public class Program
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		System.out.println("Введите предложение:");
	    System.out.print("> ");
		in = new Scanner(System.in);
	    String[] sentence = in.nextLine().split(" ");
	    if (sentence.length % 10 == 0 || (sentence.length % 10 >= 5 && sentence.length % 10 <= 9 || (sentence.length % 100 >= 11 && sentence.length % 100 <= 19)))
	    {
	        System.out.println("В предложении " + sentence.length + " слов");
	    }
	    else if (sentence.length % 10 >= 2 && sentence.length % 10 <= 4)
	    {
	        System.out.println("В предложении " + sentence.length + " слова");
	    }
	    else if (sentence.length % 10 == 1)
	    {
	        System.out.println("В предложении " + sentence.length + " слово");
	    }
	    Arrays.sort(sentence);
	    for (String word : sentence)
	    {
	        System.out.print(word + " ");
	    }
	    System.out.println();
	    for (int i = 0; i < sentence.length; ++i)
	    {
	        char[] letters = sentence[i].toCharArray();
	        letters[0] = Character.toUpperCase(letters[0]);
	        sentence[i] = new String(letters);
	    }
	    for (String word : sentence)
	    {
	        System.out.print(word + " ");
	    }
	    System.out.println();
	}
}
