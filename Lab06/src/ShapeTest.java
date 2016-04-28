public class ShapeTest 
{

	
	public void start()
	{
		double width=6, height=8, radius=5.000000, sideA=3.000000, sideB=3.000000, sideC = 5.000000;
		
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
