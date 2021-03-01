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

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square[] squares = {new Square(12), new Square(5), new Square(1.2f), new Square(3),
				new Square(8.0f), new Square(2), new Square(5.3f), new Square(9.9f), 
				new Square(18), new Square(15.9f)};
		
		System.out.println("The area of the 10 ten squares are as follows");
		for(int i = 0; i < squares.length; i++) {
			squares[i].Area();
		}

	}

}
