
public class SoldoutState implements State {
	GumballMachine machine;

	public SoldoutState(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void insertQuarter() {
		System.out.println("Sorry, the machine is sold out.");
		ejectQuarter();
	}
	
	public void ejectQuarter() {
		System.out.println("You have ejected the quarter.");
	}
	
	public void turnCrank() {
		System.out.println("You cannot turn the crank, the machine is sold out.");
	}
	
	public void dispense() {
		System.out.println("Sorry, the machine is sold out.");
	}

}