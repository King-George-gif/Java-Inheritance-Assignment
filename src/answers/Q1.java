package answers;

class Parent{
	void ParentPrint() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	void ChildPrint() {
		System.out.println("This is child class");
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1.ParentPrint();
		c1.ChildPrint();
		c1.ParentPrint();

	}

}
