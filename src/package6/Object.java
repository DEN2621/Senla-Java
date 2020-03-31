package package6;

public class Object
{
	private int mass, price;
	
	@Override
    public String toString()
    {
        return "(" + getMass() + ", " + getPrice() + ")";
    }
	
    public int getMass()
    {
    	return mass;
    }
    
    public void setMass(int value)
    {
    	if (value <= 0)
    	{
    		System.out.println("Error");
    	}
    	else
    	{
    		mass = value;
    	}
    }
    
    public int getPrice()
    {
    	return price;
    }
    
    public Object(int mass, int price)
    {
        this.mass = mass;
        this.price = price;
    }
}
