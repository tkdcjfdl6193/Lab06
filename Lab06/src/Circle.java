
public class Circle extends Shape{

	private double radius;

	public Circle(double ra) {
		radius = ra;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0)
			this.radius = radius;
	}
	
	@Override
	public double calculateArea(){
		
		return 3.14*radius*radius;
		
	}
	
	@Override
	public double calculatePerimeter(){
		return 2*radius*3.14;
	}

	@Override
	public void printInfo() {
		System.out.println("Shape ID : "+id);
		System.out.println("The radius of the circle : "+radius);
		System.out.println("The perimether's length of the circle : "+calculatePerimeter());
		System.out.println("TheArea of the of the circle : "+calculateArea());
		
	}

}
