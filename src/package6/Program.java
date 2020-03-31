package package6;

import java.util.ArrayList;

public class Program
{
    public static void main(String[] args)
    {
    	ArrayList<Object> stock = new ArrayList<Object>();
    	stock.add(new Object(11, 18));
    	stock.add(new Object(12, 17));
    	stock.add(new Object(15, 25));
    	stock.add(new Object(16, 27));
    	stock.add(new Object(17, 25));
        Backpack backpack = new Backpack(100, 0, new ArrayList<Object>());//Вместимость рюкзака
        backpack.Fill(stock);
        System.out.println("Содержимое склада:");
        for (Object obj : stock)
        {
            System.out.println(obj.toString());
        }
        System.out.println(backpack);
    }
}
