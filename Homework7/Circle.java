package Homework7;

public class Circle extends Shape {
private double radius;
public Circle(double radius) {
	this.radius = radius;
}
@Override
public double area() { //넓이
	return Math.PI*radius*radius;
}
@Override
public double perimeter() { //둘레
	return 2*Math.PI*radius;
}
@Override
public String toString() {
	return "도형의 종류:원 둘레:"+perimeter()+"cm,넓이:"+area()+"cm²";
}

}
