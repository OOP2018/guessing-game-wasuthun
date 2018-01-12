/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		WasuthunGame game = new WasuthunGame(upperBound);
		GameConsole ui = new GameConsole( );
		int solution = ui.play( game );
		//TODO display the answer returned by play
		System.out.println("play() returned "+solution);
		//TODO display how many guesses the user made
		GameSolver g=new GameSolver();
		System.out.println("GameSolver answer "+g.play(game));
	}
}
