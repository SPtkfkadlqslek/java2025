package exam05;

public class ClassCast {

	public static void main(String[] args) 
			throws Exception{
		Cat cat = new Cat();
		Method();
//		ChangeDog(cat);
//		try {
//			Method();
//		}
//		catch(ClassCastException e) {
//			System.out.println("Exception!!");
//		}
		System.out.println("Program is running!!");

	}

	public static void ChangeDog(Animal anima) {
		Dog dog = (Dog)anima;
	}
	
	public static void Method() throws NumberFormatException{
		System.out.println("Hi");
	}
}
