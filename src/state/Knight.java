package state;

public class Knight {		
	public void wake(){
		State.getTheCurrentState().wake();
	}
	public void sleep(){
		State.getTheCurrentState().sleep();
	}
	public void goUp(){
		State.getTheCurrentState().goUp();
	} 
	public void getDown(){
		State.getTheCurrentState().getDown();
	}	

}
