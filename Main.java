package sec03.exam01;

public class Main {

	public static void main(String[] args) {
		int gasTank = 100;
		int minGas = 20;
		int numOfRound = 20;
		Ca_r hyundai = new Ca_r(gasTank, minGas,
				"Hyundai", "Yellow");
		int numOfRound = 0;
		while(numOfRound < numOfRounds)
		{
			numOfRound++;
			
			if(hyundai.IsLeftGas()) {
				hyundai.RunOneRound();
			}
			else {
				hyundai.AddGas(gasTank);
			}
		}
		static void ShowNumberOfCar();
		
		hyundai.Plus(1,2);
		hyundai.Plus(1.0, 2);
		hyundai.Plus(1,  2.0);
		hyundai.Plus(1);
	}

}
