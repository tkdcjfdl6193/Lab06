import java.util.concurrent.SynchronousQueue;

public class Rectangle extends Shape
{
	
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height)
	{
		setId(3);
		if( width > 0 )
		width = this.width;
		else
			System.out.println("error");
		if( height > 0)
		height = this.height;
		else
			System.out.println("error");
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
		System.out.println("Shape ID : "+id);
		System.out.println("Rectangle's width and height : "+width+","+height);
		System.out.println("Perimeter's length of the rectangle : " + calculatePerimeter());
		System.out.println("Area of the of the rectangle" + calculateArea()+"\n");
	}
}