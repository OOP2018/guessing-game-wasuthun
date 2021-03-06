package application;
/**
 * Automatically find the secret to any NumberGame
 * 
 * @author wasuthun wanaphongthipakorn
 *
 */
public class GameSolver {
	/**
	 * play method is used to find a fast solution for solve problem
	 * 
	 * @param game
	 * @return solution of this game by using this method
	 */

	public int play(NumberGame game) {
		int min=1;
		int max=game.getUpperBound();
		int guess=min+(max-min)/2;
		while(!game.guess(guess)) {
			if(game.getMessage().contains("large")) {
				max=guess-1;
				guess=min+(max-min)/2;
				
			}else if(game.getMessage().contains("small")){
				min=guess+1;
				guess=min+(max-min)/2;
			}
		}
		
		return guess;

	}

}
