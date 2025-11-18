package exam02;

public class OutOfBound {

	public static void main(String[] args) {
		try {
			datal1 = args[0];
			datal2 = args[1];
		}
		catch(Exception e) {
			System.out.println("Array ");
		}
		System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);
	}

}
