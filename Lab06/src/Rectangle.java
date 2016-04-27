
public class Rectangle
{
	private double width = 6;
	private double height =8;
	
	
	public void Rectangle(double width, double height)
	{
		
		width = this.width;
		height = this.height;
	}
	
	public double calculateArea()
	{
		double area;
		
		area = width * height;
		
		return area;
	}
	
	public double calculatePerimeter()
	{
		double perimeter;
		
		perimeter = 2*width + 2*height;
		
		return perimeter;
	}
	
	
	// empty
	public void printInfo()
	{
		
	}
	
}