package sec03.exam01;

public class Maain {

	public static void main(String[] args) {
		Accc acc;
		Saav sav = new Saav(5000);
		
		acc = sav;
		
		sav.ShowBal();
		acc.ShowBal();
		
		System.out.println("Sav : " + sav.bal);
		System.out.println("Acc : " + acc.bal);
	}

}
