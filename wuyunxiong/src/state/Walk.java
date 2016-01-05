package state;

public class Walk extends State {

	@Override
	public void wake() {
		System.out.println("No, I am walking!");
	}

	@Override
	public void sleep() {
		System.out.println("Ok, I am going to sleep!");
		State.Chang2Sleep();
	}

	@Override
	public void goUp() {
		System.out.println("Ok, I go up!");
		State.Chang2Ride();
	}

	@Override
	public void getDown() {
		System.out.println("No, I am walking!");
	}

}
