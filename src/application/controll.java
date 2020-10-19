package application;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface controll {

	public static final String[] moneys = {"1000","500","100","50","10"};
	
	ObservableList<String> list2 = FXCollections.observableArrayList();
	
	List<DrinkInfo> drinkList = Main.drinkList;
	DrinkInfo coffee = Main.coffee;
	DrinkInfo sportsdrink = Main.sportsdrink;
	DrinkInfo cora = Main.cora;
	DrinkInfo tea = Main.tea;
	DrinkInfo water = Main.water;
	DrinkInfo energedrink = Main.energedrink;
	
	public void settextfield3(String str);
	public void settextfield2(String str);
	public void settextfield1(String str);
	public void buy_drink(int i);
	public void henkin();
	public void nyuukin(String money); 
	// public final static ResourceBundle resources;

	   // public final static ChoiceBox<String> choicebox;
	
}
