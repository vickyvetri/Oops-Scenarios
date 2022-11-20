package Scenario2;

public class sivakumar extends ActorSivakumar implements Actor {
	
	public static void main(String[] args) {
		
		Actor ac = new sivakumar();
		ac.sing();
		ac.act();
		ac.dance();
		System.out.println(ac.address);
	}
}
