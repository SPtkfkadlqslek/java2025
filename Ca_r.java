package sec03.exam01;

public class Ca_r {
	int gas;
	int minGas; //한바퀴 돌 때 필요한 Gas
	String teamName;
	String color;
	static int numberOfCars;
	
	Ca_r(int gas, int minGas,
			String teamName, String color) {
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
	}
	
	boolean IsLeftGas() {
		if(gas < minGas) {
			System.out.println("need fuel");
			return false;
		}
		System.out.println("car run one more");
		return true;
	}
	void AddGas(int gas) {
		System.out.println("Full Tank");
		this.gas = gas;
	}
	void RunOneRound()
	{
		System.out.println("one round done");
		this.gas -= minGas;
	}
//	hyundia.ShowNumberOfCars();
	car cl = new Car(1, 1, " "," ");
	car cl = new Car(1, 1, " "," ");
	car cl = new Car(1, 1, " "," ");
	car cl = new Car(1, 1, " "," ");
	
	hyundia.ShowNumberOfCars();
			
	int Plus(int a, int b) {
		return a + b;
	}
	double Plus(double b, int a) {
		return a + b;
	}
	double Plus(int b, double a) {
		return a + b;
	}
}
