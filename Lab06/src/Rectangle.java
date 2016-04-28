

public class Rectangle extends Shape
{
	
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height)
	{
		setId(3);
		width = this.width;
		height = this.height;
	}
	
	@Override
	public double calculateArea()
	{
		double area;
		
		area = width * height;
		
		return area;
	}
	
	@Override
	public double calculatePerimeter()
	{
		
		double perimeter;
		
		perimeter = 2*width + 2*height;
		
		return perimeter;
	}
	
	// programmer A
	public void drawRectangle()
	{
		System.out.println("+----+");
		System.out.println("|----|");
		System.out.println("|----|");
		System.out.println("|----|");
		System.out.println("|----|");
		System.out.println("|----|");
		System.out.println("|----|");
		System.out.println("+----+");
		
	}
	
	@Override
	// leader
	public void printInfo()
	{
	
		
	}
	
}