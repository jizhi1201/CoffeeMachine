package state;

public abstract class State {
	private static final State SLEEP = new Sleep();
	private static final State WALK = new Walk();
	private static final State RIDE = new Ride();
	private static State theCurrentState = RIDE;
	protected static void Chang2Sleep(){
		theCurrentState = SLEEP;
	}
	protected static void Chang2Walk(){
		theCurrentState = WALK;
	}
	protected static void Chang2Ride(){
		theCurrentState = RIDE;
	}	
	public static State getTheCurrentState() {
		return theCurrentState;
	}
	public abstract void wake();
	public abstract void sleep();		
	public abstract void goUp();
	public abstract void getDown();	
}
