package answers;

class Rectangle{
	float length, breadth;
	
	Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void Area() {
		System.out.println(this.length * this.breadth);
	}
	
	void Perimeter() {
		System.out.println((2*this.length) + (2*this.breadth));
	}
}

class Square extends Rectangle{
	Square(float s){
		super(s,s);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(8.9f, 20);
		Square square1 = new Square(12.6f);
		
		System.out.print("Area of rectangle: ");
		rect1.Area();
		System.out.print("Perimeter of rectangle: ");
		rect1.Perimeter();
		
		System.out.println("Area of square: ");
		square1.Area();
		System.out.println("Perimeter of square: ");
		square1.Perimeter();
		
		

	}

}
