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
			return name;		
		}
		public void setStartingHP(int hp) {
			System.out.println(hp);
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
			if (caller == getName()) {
				double x = Math.random();
				int y = 0;
				String action = "";
				if (x <= (1 / 3)) {
					y = 0;
					action = "guard";
				}
				else if (x > (1 / 3) && x <= (2 / 3)){
					y = 1;
					action = "load";
				}
				else if (x > (2 / 3)) {
					y = 2;
					action = "shoot";
				}
				return y;
			}
			else {
				return;
			}
		}
		public void hit(Object caller) {
			int h = hp;
			h - 10 = hp;
			return hp; 
		}
}




