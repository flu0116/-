package curriculum_C;
/*
 * Q1：フィールドに動物の名前の変数を定義してください。
 * Q2：フィールドに動物の数の変数を定義してください。
 * Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
 * Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
 */

// 設計図クラス
public class Dog {
	String name; // 動物の名前を初期化する
	int count; // 動物の数を初期化する
	
	public  Dog () { // 引数なしコンストラクタ、犬を代入する
		this.name = "犬";
	}
	
	public Dog (int count) { // 引数ありコンストラクタ、犬を名前し、数に引数で受け取るの値を代入する
		this.name = "犬";
		this.count = count;
	}
}