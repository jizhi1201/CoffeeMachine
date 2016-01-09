package state;

public class Ride extends State {

	@Override
	public void wake() {
		System.out.println("No, I am riding!");
	}

	@Override
	public void sleep() {
		System.out.println("No, I am riding!");
	}

	@Override
	public void goUp() {
		System.out.println("No, I am riding!");
	}

	@Override
	public void getDown() {
		System.out.println("Ok, I get down!");
		State.Chang2Walk();
	}

}
