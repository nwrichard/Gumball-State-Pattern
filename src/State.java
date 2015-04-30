/* Here we are putting all the behavior of a state in this interface.  That way, the 
   concrete classes localize the behavior thus making things easier to change and 
   understand */

public interface State {
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();
}