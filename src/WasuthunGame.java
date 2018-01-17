import java.util.Random;
/**
 * This class is my game that build by using super class NumberGame
 * and contain a necessary attribute and method.
 * @author wasuthun wanaphongthipakorn
 *
 */
public class WasuthunGame extends NumberGame{
	/**
	* Game of guessing a secret number.
	* @author Wasuthun Wanaphongthiakorn
	*/
	/*
	 * upperbound of this game
	 */
	private int upperBound;
	/*
	 * solution of this game
	 * */
	private int secret;
	/*
	 * constructor of this class
	 * @param upperBound
	 */
	public WasuthunGame(int upperBound) {
		this.upperBound=upperBound;
		long seed=System.nanoTime();
		Random rand=new Random(seed);
		this.secret=rand.nextInt(upperBound)+1;
		super.setMessage("I'm thinking of a number between 1 and "+this.upperBound);
	}
	/*
	 * guess method is use to guess number and return true if number equal secret and else is false
	 * @param number
	 * @return solution of your guess
	 */
	public boolean guess(int number) {
		super.setCount(getCount()+1);
		if(number==this.secret) {
			super.setMessage("Correct Count "+getCountWasuthun());
			return true;
			}
		else if(number<this.secret) { 
			super.setMessage("too small");
			return false;
			}
		else{
			super.setMessage("too large");
			return false;
		}
		
	}
	/*
	 * this method is use to access a count
	 * @return count of guess; 
	 */
	public int getCountWasuthun() {
		return super.getCount();
	}
	/**
	 * this method is use to access a upperBound
	 * @return upperBound
	 */
	public int getUpperBound() {
		return this.upperBound;
	}
	/**
	 * this method is use to return general description
	 * @return general description
	 */
	public String toString() {
		return "Guess a secret number between 1 and "+this.upperBound;
	}
	
}
