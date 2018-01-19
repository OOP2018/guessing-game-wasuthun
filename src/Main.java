/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 10;
		WasuthunGame game = new WasuthunGame(upperBound);
		GameConsole ui = new GameConsole( );
		int solution = ui.play( game );
		System.out.println("play() returned "+solution);
		GameSolver2 gg=new GameSolver2();
		game.setCount(0);
		System.out.println("GameSolver answer "+gg.play(game) + " Count "+ game.getCount());
	}
}
