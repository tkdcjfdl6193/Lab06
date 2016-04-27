
public class Circle {

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
	
	//@Override
	public double calculateArea(){
		
		return 3.14*radius*radius;
		
	}
	
	//@Override
	public double calculatePerimeter(){
		return 2*radius*3.14;
	}

}
