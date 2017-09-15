package duel;

public  class CharacterB implements Dueler{
	private String name;
	private int hp;
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
		public int getAction(Object caller) {
			double x = Math.random();
			if (x < .3){
				return 0;
			else(.3 )
			}
			
		}
		public void hit(Object caller) {
			
		}
}




