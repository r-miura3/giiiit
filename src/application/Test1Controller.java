package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class Test1Controller implements controll {
	int sum_money = 0; 
	
	ObservableList<String> list2 = FXCollections.observableArrayList();
	
	protected static List<Button> buttonList;
	
    @FXML private ResourceBundle resources;
    
    @FXML public Label label1 = new Label();
    @FXML public Label label2 = new Label();
    @FXML public Label label3 = new Label();
    @FXML public Label label4 = new Label();
    @FXML public Label label5 = new Label();
    @FXML public Label label6 = new Label();
    
    @FXML public Button button1;
    @FXML public Button button2;
    @FXML public Button button3;
    @FXML public Button button4;
    @FXML public Button button5;
    @FXML public Button button6;
    @FXML public Button button7;
    @FXML public Button button8;
    
    @FXML private ChoiceBox<String> choicebox;
    @FXML public URL location = null;
    
    @FXML public TextArea textfield1 = new TextArea();
    @FXML public TextArea textfield2 = new TextArea();
    @FXML public TextField textfield3 = new TextField();
//textfield3に表示させる関数
    public void settextfield3(String str) {
    	textfield3.setText(str);
    }
  //textfield2に表示させる関数
    public void settextfield2(String str) {
        textfield2.setText(str);
    }
  //textfield1に表示させる関数
    public void settextfield1(String str) {
        textfield1.setText(str);
    }
        
    @FXML
    void initialize() {
    	label1.setText(coffee.getName() + "\n" + coffee.getMoney());
    	label2.setText(sportsdrink.getName() + "\n" + sportsdrink.getMoney());
    	label3.setText(cora.getName() + "\n" + cora.getMoney());
    	label4.setText(tea.getName() + "\n" + tea.getMoney());
    	label5.setText(water.getName() + "\n" + water.getMoney());
    	label6.setText(energedrink.getName() + "\n" + energedrink.getMoney());
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert button8 != null : "fx:id=\"button8\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert choicebox != null : "fx:id=\"choicebox\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert textfield1 != null : "fx:id=\"textfield1\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert textfield2 != null : "fx:id=\"textfield2\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert button7 != null : "fx:id=\"button7\" was not injected: check your FXML file '自販機GUI.fxml'.";
        assert textfield3 != null : "fx:id=\"textfield3\" was not injected: check your FXML file '自販機GUI.fxml'.";
    	list2.removeAll(list2);
    	choicebox.getItems().addAll("10","50","100","500","1000");
    	
    	buttonList = new ArrayList<Button>();
		
		buttonList.add(button1);
		buttonList.add(button2);
		buttonList.add(button3);
		buttonList.add(button4);
		buttonList.add(button5);
		buttonList.add(button6);
    }
    //buttonがクリックされたら呼び出される関数
    @FXML public void ActionClick(ActionEvent e) {
    	//clickされたボタンのテキストを取得
    	String s = ((Button)e.getSource()).getText();
	    	switch(s) {
	    	case "ボタン1":
	    		buy_drink(0);
	    		break;
	    	case "ボタン2":
	    		buy_drink(1);
	    		break;
	    	case "ボタン3":
	    		buy_drink(2);
	    		break;
	    	case "ボタン4":
	    		buy_drink(3);
	    		break;
	    	case "ボタン5":
	    		buy_drink(4);
	    		break;
	    	case "ボタン6":
	    		buy_drink(5);
	    		break;
	    	case "入金":
	    		String money = choicebox.getValue();
		    	nyuukin(money);
		    	break;
	    	case "返金":
	    		henkin();
	        	break;
	        default :
	        	break;
	    	}
	}
    //buyボタンをクリックしたら呼び出される関数
    public void buy_drink(int i) {
    	//syouhinの在庫がある　かつ　入金合計額が商品価格を上回っているかチェック
		if(drinkList.get(i).getMoney()<=sum_money && drinkList.get(i).getZaiko() != 0){
			sum_money -= drinkList.get(1).getMoney();
			drinkList.get(i).setZaiko(drinkList.get(i).getZaiko() - 1);
			textfield1.appendText(drinkList.get(i).getName() + "を購入しました\n");
			//syouhinの在庫が０ならボタンの表示を売り切れにする
			if(drinkList.get(i).getZaiko() == 0) {
				buttonList.get(i).setText("売り切れ");
			}
		}
		//nowの入金合計額を表示
    	settextfield3(String.valueOf(sum_money));
	}
    //henkinボタンをクリックしたら呼び出される関数
    public void henkin() {
    	//nyuukin額があるかどうかチェック
		if(sum_money != 0) {
			//moneysの配列｛1000.500.100.50.10｝の順番に返金計算
    		for(String m : moneys) {
    			int count=0;
    			boolean flag = true;
    			//mと
	    			while(flag == true) {
	    			if(sum_money>=Integer.parseInt(m)) {
	    				sum_money -= Integer.parseInt(m);
	    				count++;
	    			}else {
	    				flag = false;
	    				if(count>0) {
	    					textfield2.appendText(m + "円" + count + "枚\n");
	    				}
	    			}
    			}
    		}
    		textfield2.appendText("返金しました\n");
        	textfield3.setText(String.valueOf(sum_money));
		}
	}
    //nyuukinボタンをクリックしたら呼び出される関数
    public void nyuukin(String money) {
    	//choiceboxで金額を選択していないかチェック
    	    	if(money == null) {
    	    		settextfield3("No select");
    	    	}else {
    	    		int m = Integer.parseInt(money);
    	    		//n入金合計額が1990円を超えているかチェック
    	    			if(sum_money + m <= 1990) {
    	    				sum_money += m;
    	    				settextfield3(String.valueOf(sum_money));
    	    			}else {
    	    				settextfield2(m + "円1枚\n返金しました\n");
    	    			}
    	    	}
    		}
}
