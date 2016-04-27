
public class Triangle extends Shape {

	private double side1;
	private double side2;
	private double side3;

	public Triangle(double sideA, double sideB, double sideC) {
		side1 = sideA;
		side2 = sideB;
		side3 = sideC;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		if (side1 > 0)
			this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		if (side2 > 0)
			this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		if (side3 > 0)
			this.side3 = side3;
	}
	
	//@Override
	public double calculatePerimeter(){
		return side1+side2+side3;
	}
	
	//@Override
	public double calculateArea(){
		double temp = (side1+side2+side3)/2;
		return Math.sqrt((temp*(temp-side1)*(temp-side2)*(temp-side3)));
	}

}
