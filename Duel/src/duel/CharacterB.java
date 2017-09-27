package duel;

public  class CharacterB implements Dueler{
	private String name;
	private int hp;
	private boolean isLoaded;
	
	public CharacterB() {
		
	}
	
	public void taunt() {
		System.out.println("You Will Lose!");
	}
	
	public String getName(){
		name = "Jas";
		return name;		
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		if (d.getHP() == target) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getAction(Object caller) {
		if (caller instanceof Duel) {
			if (isLoaded == true) {
				double x = Math.random(); 
				if (x >= .3) {
					return Duel.SHOOTING;
				}
				else {
					return Duel.GUARDING;
				}
			}
			else {
				double x = Math.random();
				if (x >= .3) {
					isLoaded = true;
					return Duel.LOADING;
				}
				else {
					return Duel.GUARDING;
				}
			}
		}
		return Duel.YEAH_RIGHT;
	}
		
	public void hit(Object caller) {
		if (caller instanceof Duel) {
			hp = hp - 10;
		}
	}
}




