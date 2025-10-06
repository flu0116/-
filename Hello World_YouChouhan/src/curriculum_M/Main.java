package curriculum_M;

public class Main {

	public static void main(String[] args) {
	// Personインスタンス作成
	Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
	Person person2 = new Person("山田", "花子", 22, 1.5, 40);
				
	// Vehicleのサブクラスのインスタンスを作成
	Car car = new Car();
	Bicycle bicycle = new Bicycle();
				
	// それぞれの人が購入
	person1.buy(car);
	person2.buy(bicycle);
				
	// 購入結果を確認
	System.out.println("【確認】");
	System.out.println("車の所有者：" + car.getOwner());
    System.out.println("自転車の所有者：" + bicycle.getOwner());
	}

}
