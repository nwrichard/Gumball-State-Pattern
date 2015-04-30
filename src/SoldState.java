public class SoldState implements State {
	GumballMachine machine;
	
	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void insertQuarter() {
		System.out.println("You already have a quarter in.");
	}
	
	public void ejectQuarter() {
		System.out.println("You already turned the crank.");
	}
	
	public void turnCrank() {
		System.out.println("You already turned the crank.");
	}
	
	public void dispense() {
		System.out.println("Here is your gumball, pal!");
		machine.releaseBall();
	}

}
