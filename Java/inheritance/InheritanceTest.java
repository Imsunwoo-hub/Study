package inheritance;

class Parent{
	int i = 8;
	public int get() {
		return i;
	}
}

class Child extends Parent{
	int i=3;
	public int get() {
		return i;
	}
}

public class InheritanceTest {

	public static void main(String[] args) {

		Parent parent = new Parent();
		System.out.println(parent.i);
		System.out.println(parent.get());
		
		Child child = new Child();
		System.out.println(child.i);
		System.out.println(child.get());
		
		Parent pChild = new Child();
		System.out.println(pChild.i);
		System.out.println(pChild.get());

	}

}
