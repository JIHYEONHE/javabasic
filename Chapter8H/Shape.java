package Chapter8H;

public abstract class Shape implements Comparable<Shape> {  

	public abstract double area();

	public abstract double perimeter();

	@Override
	public int compareTo(Shape o) { //재정의
		if (this.area() > o.area()) {
			return 1; //자리를 바꾸고 싶으면
		} else if (this.area() < o.area()) {
			return -1; //안바꾸고 싶으면
		} else {
			return 0; //같으면 0
		}
	}
}
