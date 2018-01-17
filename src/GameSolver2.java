/**
 * Automatically find the secret to any NumberGame
 * @author wasuthun wanaphongthipakorn
 *
 */
public class GameSolver2 {
	/**
	 * this attribute is use for recursive and initial
<<<<<<< HEAD
	 * numGuess and num is upperbound/2
=======
	 * numGuess and num is upperBound in main class divided by two
>>>>>>> da995857ca9083954de450ae717bb09e50c3da9c
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
			if(numGuess==1&&num==1)
				numGuess=2;
			else if(numGuess==0&&num==0) 
				numGuess=1;
			else {
			numGuess += num / 2;
			num = num / 2;
			}
			return play(game);
		} else if (game.getMessage().contains("large")) {
			if(numGuess==1&&num==1)
				numGuess=2;
			else if(numGuess==0&&num==0) 
				numGuess=1;
			else {
			numGuess -= num / 2;
			num = num / 2;
			}
			return play(game);
		}
		return 0;
	}
}
