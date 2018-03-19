package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
/**
 * This class use for link and action of SceneBuilder
 * @author wasuthun wanaphongthipakorn
 *
 */
public class SampleController {
	/**
	 * Attribute game
	 */
	private NumberGame game;
	/**
	 * Attribute button
	 */
	@FXML
	private Button button1;
	/**
	 * Attribute button
	 */
	@FXML
	private Button button2;
	/**
	 * Attribute button
	 */
	@FXML
	private Button button3;
	/**
	 * Attribute textfield
	 */
	@FXML
	private TextField textField;
	/**
	 * Attribute text
	 */
	@FXML
	private Text text1;
	/**
	 * Use to set a game
	 * @param game
	 */
	public void setGame(NumberGame game) {
		this.game = game;
	}
	/**
	 * Click button to play a game
	 * @param event
	 */
	public void handleClick(ActionEvent event) {
		String text=textField.getText().trim();
		 if(!text.equals("")) {
		 try {
			 int text2=Integer.parseInt(text);
			  if(game.guess(text2)) {
				  text1.setText(game.getMessage());
				  //text3.setText(""+text2);
			  }else {
				  text1.setText(game.getMessage());
			  }
		 }catch(NumberFormatException e) {
			 	textField.setText("Error!!");
				textField.setStyle("-fx-text-fill: red");
		 }
		 }
	}
	/**
	 * Click button to solve a game by bot
	 * @param event
	 */
	 public void handleSolve(ActionEvent event) {
		        GameSolver solve = new GameSolver();
		 		text1.setText("Solution is "+solve.play(game));
	 }
	 /**
	  * Click button to clear text field
	  * @param event
	  */
	 public void handleClear(ActionEvent event) {
		 	textField.clear();
			textField.setStyle("-fx-text-fill: black");
	 }
	 
	
}
