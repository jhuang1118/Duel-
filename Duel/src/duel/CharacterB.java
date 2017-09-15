package duel;

public class CharacterB implements Dueler{
	
	private String name;
	public CharacterB() {}
		public void taunt() {
			System.out.println("You will lose");
		}
		public String getName(){
			name = "Jas";
			return name;		}
		public void setStartingHP(int hp) {
			System.out.println(hp);
		}
		public int getHP() {
			return hp;
		}
		public boolean determineIfOpponentIsFair(Dueler d, int target) {
			return true;
		}
}




