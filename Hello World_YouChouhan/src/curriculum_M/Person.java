package curriculum_M;

// 人員情報の設計図クラス
public class Person {
	
	// 変数を定義する
	private String firstName; // 名字
	private String lastName;  // 名前
	private int age;          // 年齢
	private double height;    // 身長
	private double weight;    // 体重
	
	private static int count = 0; // 人数カウント
	
	// 初期化する
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}
	
	// フルネームを返す
	public String fullName() {
		return this.firstName + this.lastName;
	}
	
	// BMIを返す
	public double bmi() {
		return this.weight / (this.height * this.height);
	}
		
	// 結果を出力する
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println();
	}
	
	// 人数を出力する
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	// buyメソッド
	// Carを購入する場合
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が車を購入しました");
	}
		
	// Bicycleを購入する場
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が自転車を購入しました");
	}

}
