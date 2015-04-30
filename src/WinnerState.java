
public class WinnerState implements State {
	GumballMachine machine;
	
	public WinnerState(GumballMachine machine) {
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
		System.out.println("You're a winner! Have another gumball!");
		machine.releaseBall();
		machine.setState(machine.getNoQuarterState());
	}

}
