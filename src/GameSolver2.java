/**
 * Automatically find the secret to any NumberGame
 * @author wasuthun wanaphongthipakorn
 *
 */
public class GameSolver2 {
	/**
	 * this attribute is use for recursive and initial
	 * numGuess and num is upperBound in main class divided by two
	 */
	private int numGuess = 50;
	private int num = 50;
	/**
	 * play method is used to find a fast solution for solve problem
	 * @param game
	 * @return solution of this game by using this method
	 */
	public int play(NumberGame game) {

		if (game.guess(numGuess)) {
			return numGuess;
		} else if (game.getMessage().contains("small")) {
			numGuess += num / 2;
			num = num / 2;

			return play(game);
		} else if (game.getMessage().contains("large")) {
			numGuess -= num / 2;
			num = num / 2;

			return play(game);
		}
		return 0;
	}
}
