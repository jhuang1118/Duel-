package duel;

public class CharacterA implements Dueler {
	private String name;
	private int hp;
	public CharacterA() {}
		public void taunt() {
			String[]phrases = {"You will lose!","Die!","Experience tranquility","Yoooooooooo!"};
			int pickRandom = (int) ((Math.random() * 4 ) + 0);
			System.out.println(phrases[pickRandom]);
		}
		public String getName() {
			name = "Johnson";
			return name;
		}
		public void setStartingHP(int hp) {
			System.out.println(hp);
		}
		public int getHP() {
			return hp;
		}
	}



