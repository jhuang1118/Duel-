package duel;

public  class CharacterB implements Dueler{
	
	public CharacterB() {
		
	}
	public void taunt() {
		String taunting = "You will lose";
		System.out.println(taunting);
	}
	public String getName(){
		String name = "Johnson";
		System.out.println("name");
	}
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		return true;
	}
}
