package duel;
//Johnson Huang
public class CharacterA implements Dueler {
	private String name;
	private int currentHP;
	private boolean isLoaded;
	
	String[] phrases = {"You will lose!","Die!","Experience tranquility","Yoooooooooo!"};
	public CharacterA() {
		this.name = "Ryu";
	}
		public void taunt() {
			int rng = (int)(Math.random() * phrases.length);
			if(rng != 1) {
				System.out.println("Ryu says, '" + phrases[rng] + "'");
			}
			else {
				System.out.println(phrases[rng]);
			}
		}
		public String getName() {
			return name;
		}
		public void setStartingHP(int hp) {
			currentHP = hp;
			isLoaded = false;
		}
		public int getHP() {
			return currentHP;
		}
		public boolean determineIfOpponentIsFair(Dueler d, int target) {
			if(d.getHP() != currentHP) {
				return false;
			}
			return true;
		}
		public int getAction(Object caller) {
			int rngAction = (int)(Math.random()*10);
			
			if(caller instanceof Duel) {
				if(this.currentHP >= 20) {
					if(rngAction < 8) {
						return 2;
					}
					else if (rngAction < 2) {
						this.isLoaded = true;
						return 0;
					}
					else {
						return shoot();
					}
				}
				else {
					if(rngAction <= 5) {
						return 0;
					}
					else {
						return shoot();
					}
				}
				
			}
			return 3;
				
		}
		public void hit(Object caller) {
			if(caller instanceof Duel) {
				this.currentHP -= 10;
			}
				
		}
		public int shoot() {
			if(isLoaded == true) {
				isLoaded = false;
				return 1;
			}
			else {
				int action = (int)(Math.random() * 2);
				if(action == 0) {
					return action;
				}
				return 2;
			}
	}
}
