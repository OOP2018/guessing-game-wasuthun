package application;
	
import java.net.URL;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/**
 * This class use to run this application
 * @author wasuthun wanaphongthipakorn
 *
 */
public class Main extends Application {
	/**
	 * Use to open fxml file and run a CounterView
	 */
	@Override
	public void start(Stage primaryStage) {
		{try{
		NumberGame game = new WasuthunGame(10);
		URL url = getClass().getResource("Sample.fxml");
		if (url == null) {
			System.out.println("Couldn't find file: ClickUI.fxml");
			Platform.exit();
		}
		// Load the FXML and get reference to the loader
		FXMLLoader loader = new FXMLLoader(url);
		// Create the UI. This will instantiate the controller object, too.
		Parent root = loader.load();
		// Now we can get the controller object from the FXMLloader.
		// This is interesting -- we don't need to use a cast!
		SampleController controller = loader.getController();
		
		// Dependency Injection:
		// Set the Counter object we want the view to update.
		
		controller.setGame(game);

		// Build and show the scene
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setTitle("Click Counter");
		primaryStage.show();
		// Add an observer that displays the Counter value on console.
		// Dependency Injection: 
		// We set a reference to the counter using the constructor.

		
		
		// Create another window that references the SAME counter. 
		

		CounterView counterView=new CounterView(game);
		CounterView2 counterView2=new CounterView2(game);
		game.addObserver(counterView);
		game.addObserver(counterView2);
		counterView.run();
		counterView2.run();
	} catch (Exception e) {
		e.printStackTrace();
		return;
	}
	
	
	}}
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
