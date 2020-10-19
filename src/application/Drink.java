package application;

class DrinkInfo{
	private String name;
	private int money=0;
	private int zaiko=0;
	
	public DrinkInfo(String name, int money, int zaiko) {
		super();
		this.name = name;
		this.money = money;
		this.zaiko = zaiko;
	}
//drinkの名前を取得する関数
	public String getName() {
		return name;
	}
//drinkの名前を更新する関数
	public void setName(String name) {
		this.name = name;
	}
	//drinkの価格を取得する関数
	public int getMoney() {
		return money;
	}
	//drinkの価格を更新する関数
	public void setMoney(int money) {
		this.money = money;
	}
	//drinkの在庫を取得する関数
	public int getZaiko() {
		return zaiko;
	}
	//drinkの在庫を更新する関数
	public void setZaiko(int zaiko) {
		this.zaiko = zaiko;
	}
}