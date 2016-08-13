package player;

public class Player2 {

	public String returnRandom() {

		int random = (int) (Math.random() * 3);

		String randomDraw = " ";

		if (random == 1) {
			randomDraw = "Rock";
		}

		else if (random == 2) {
			randomDraw = "Paper";
		} else {
			randomDraw = "Scissors";
		}
		return randomDraw;

		// return randomDraw;
	}
}
