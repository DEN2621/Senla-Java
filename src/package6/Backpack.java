package package6;

import java.util.ArrayList;

public class Backpack
{
	private int maxMass, worth;
	
	public ArrayList<Object> objects;
	
	@Override
    public String toString()
    {
		String s = "Стоимость рюкзака: " + worth;
        s += "\nСодержимое рюкзака:";
        for (Object obj : objects)
        {
            s += "\n" + obj.toString();
        }
        return s;
    }
	
	public Backpack(int maxMass, int worth, ArrayList<Object> objects)
	{
		this.maxMass = maxMass;
		this.worth = worth;
		this.objects = objects;
	}
	private boolean first = true;
	public Backpack Fill(ArrayList<Object> stock)
	{
		worth = 0;
		objects = new ArrayList<Object>();
		Backpack temp = this;
		if(!first)
		{
			stock.remove(0);
		}
		first = false;
		if (stock.size() > 0)
		for (Object obj : stock)
		{
			if (maxMass > obj.getMass())
			{
				maxMass -= obj.getMass();
				temp = Fill(stock);
				if (temp.worth + obj.getPrice() > worth)
				{
					worth = temp.worth + obj.getPrice();
					objects.add(obj);
				}
			}
		}
		first = true;
		return temp;
	}
}
