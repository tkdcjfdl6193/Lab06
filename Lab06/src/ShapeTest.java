
public class ShapeTest 
{

	
	public void start()
	{
		double width=0, height=0, radius=0, sideA=0, sideB=0, sideC = 0;
		
		Shape[] shape = new Shape[3];
		shape[0] = new Rectangle(width, height);
		shape[1] = new Circle(radius);
		shape[2] = new Triangle(sideA, sideB, sideC);
		
		for(int i=0; i < shape.length; i++)
		{
			processShape(shape[i]);
		}
		
	}
	
	public void processShape(Shape shape)
	{
		if(shape instanceof Rectangle)
		{
			Rectangle rec = (Rectangle)shape;
					rec.drawRectangle();
		}
		
		shape.printInfo();	
	}
	
	public static void main(String[] args) 
	{
		ShapeTest st = new ShapeTest();
		st.start();
		
	}

}
