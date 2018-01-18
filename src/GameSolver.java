import java.util.Random;
/**
 * Automatically find the secret to any NumberGame
 * @author wasuthun wanaphongthipakorn
 *
 */
public class GameSolver {
	/**
	 * this attribute is use for lowerbound for random
	 */
	private int num = 0;
/**
 * play method is used to find a fast solution for solve problem
 * @param game
 * @return solution of this game by using this method
 */
	public int play(NumberGame game) {
		int value = 0;
		boolean correct = false;
		while (!correct) {
			long seed = System.nanoTime();
			Random rand = new Random(seed);
			value = num + rand.nextInt(game.getUpperBound()) + 1;
			if (game.guess(value)) {
				correct = true;
			} else if (!game.guess(value) && game.getMessage().contains("small")) {
				
				num = value;
			} else if (!game.guess(value) && game.getMessage().contains("large")) {

			}

		}
		return value;
	}
}
