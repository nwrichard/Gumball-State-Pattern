import java.util.Random;
public class HasQuarterState implements State {
	GumballMachine machine;
	
	public HasQuarterState(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void insertQuarter() {
		System.out.println("You already have a quarter in.");
	}
	
	public void ejectQuarter() {
		System.out.println("You have ejected the quarter.");
		machine.setState(machine.getNoQuarterState() );
	}
	
	public void turnCrank() {
		System.out.println("You turned the crank!");
		Random gen = new Random();
		int win = gen.nextInt(10);
		if(win == 10)
			machine.setState(machine.getWinnerState());
		if(machine.getCount() == 0)
			machine.setState(machine.getSoldOutState());
		else
			machine.setState(machine.getSoldState());
	}
	
	public void dispense() {
		System.out.println("You need to turn the crank first.");
	}

}
