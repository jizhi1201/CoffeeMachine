package state;

public class Sleep extends State {

	@Override
	public void wake() {		
		System.out.println("Ok, I walk now!");
		State.Chang2Walk();
	}

	@Override
	public void sleep() {
		System.out.println("No, I am sleeping!");
	}

	@Override
	public void goUp() {
		System.out.println("No, I am sleeping!");
	}

	@Override
	public void getDown() {
		System.out.println("No, I am sleeping!");
	}

}
