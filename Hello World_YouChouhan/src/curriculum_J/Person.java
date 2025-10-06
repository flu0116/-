package curriculum_J;
/*
 * 問題1：インスタンスフィールドを定義してください
 * 問題2：コンストラクタを定義してください（下記それぞれの引数）
 * 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
 * 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
 * 問題5：Main.javaの引数にweightの60を入れてください
 * 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
 * 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
 * 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
 * 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
 * 問題10：人数の合計を「合計○人です」と出力してください。
 */

// 設計図クラス
public class Person {
	// フィールド,変数を定義する
	String name;   // 名前
	int age;       // 年齢
	double height; // 身長
	double weight; // 体重
	
	// コンストラクタ、初期化する
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// BMIの数値を返す
	double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	// 結果を出力する
	void print() {
		System.out.println("名前は " + this.name + " です。");
		System.out.println("年は " + this.age + " 歳です。");
		System.out.println("BMIは " + String.format("%.2f", this.bmi()) + " です。"); // 小数点2桁表示
		System.out.println(); // 改行
	}
	
	// 人数の合計を出力する
	static void printTotal(int total) {
		System.out.println("合計 " + total + " 人です。");
	}

}
