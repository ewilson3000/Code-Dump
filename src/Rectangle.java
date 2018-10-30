
public abstract class Rectangle extends Shape{
	
	private int iwidth;
	private int ilength;
	
	
	public int getiWidth()
	{
		return iwidth;
	}
	
	public void setiWidth(int w)
	{
		iwidth = w;
	}
	
	public int getiLength()
	{
		return ilength;
	}
	
	public void setiLength(int l)
	{
		ilength = l;
	}
	
	public int compareTo(Object o)
	{
		Rectangle r = (Rectangle) o;
		
		
	}

}
