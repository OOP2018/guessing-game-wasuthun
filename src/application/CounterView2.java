package application;

import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * This class use to show UI of number that you guess
 * @author wasuthun wanaphongthipakorn
 *
 */
public class CounterView2 extends Stage implements Observer{
	/**
	 * Attribute game
	 */
	private NumberGame game;
	/**
	 * Attribute lable
	 */
	private Label label;
	/**
	 * Attribute UI number
	 */
	private int lastguess = 0;
	/**
	 * Constructor
	 * @param game
	 */
	public CounterView2(NumberGame game) {
		this.game=game;
		initComponents();
	}
	
	/**
	 * Initialize a UI
	 */
	private void initComponents() {
		// components and containers for our window
				HBox root = new HBox();
			
				root.setPadding(new Insets(10));

				root.setAlignment(Pos.CENTER);
				// The label that will show the counter value.
				label = new Label("   ");
				// make the label big enough
				label.setPrefWidth(144);

				label.setFont(new Font("Arial", 80.0));

				label.setAlignment(Pos.CENTER);
				// Add the label to the HBox.  You can all more components, too.
				root.getChildren().add(label);
				// Create a Scene using HBox as the root element
				Scene scene = new Scene(root);
				// show the scene on the stage
				this.setScene(scene);
				this.setTitle("Value");
				this.sizeToScene();
		
	}
	/** Show the window and update the counter value. */
	public void run() {
		this.show();
		displayValue(lastguess);
	}
	/**
	 * Set data in to the text label
	 */
	public void displayValue(int value) {
		label.setText( String.format("%d", value) );
	}
	/**
	 * Use to update a data to text 
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (arg != null)
			lastguess = (int) arg;
		displayValue(lastguess);
	}
}
