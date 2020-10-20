package application;

import java.util.ArrayList;
//import java.awt.Label;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	protected static List<DrinkInfo> drinkList;
	static DrinkInfo coffee;
	static DrinkInfo sportsdrink;
	static DrinkInfo cora;
	static DrinkInfo tea;
	static DrinkInfo water;
	static DrinkInfo energedrink;
	///aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	@Override
	public void start(Stage Stage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Test1.fxml"));
			Scene scene = new Scene(root,400,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage.setScene(scene);
			Stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//33
	//44
	//55
	//66
	//77
	public static void main(String[] args) {
		coffee = new DrinkInfo("coffee",120,10);
		sportsdrink = new DrinkInfo("sportsdrink",150,10);
		cora = new DrinkInfo("cora",160,10);
		tea = new DrinkInfo("tea",110,10);
		water = new DrinkInfo("water",130,10);
		energedrink = new DrinkInfo("energedrink",140,10);

		drinkList = new ArrayList<DrinkInfo>();

		drinkList.add(coffee);
		drinkList.add(sportsdrink);
		drinkList.add(cora);
		drinkList.add(tea);
		drinkList.add(water);
		drinkList.add(energedrink);

		launch(args);
	}
}
