import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 *  @author wasuthun wanaphongthipakorn
 */
public class GameConsole {

	/**
	 * play method is used to run a game that is parameter of this method
	 * @param game
	 * @return solution
	 */
	/** play the game. */
	/*
	 * play method is used to run and play a game class
	 * @param game
	 * @return secret number
	 * */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		
		// describe the game
		boolean correct=false;
		int guess=0;
		System.out.println( game.toString() );
		while(!correct) {
		// This is just an example.
		System.out.print("Your answer? ");
		guess = console.nextInt();
		correct = game.guess(guess);
		System.out.println( game.getMessage() );
		}
		return guess;
	}
	
}
