package curriculum_C;
/* 
 * Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
 * Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
 * 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
 */

// 日時取得・整形のためのクラスをインポート
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// 実行用クラス
public class Animal {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog(); // Dogクラスの引数なしコンストラクタを呼び出しする
		System.out.println("動物の名前：" + dog1.name); // 動物の名前を出力する
		
		Dog dog2 = new Dog(3); // Dogクラスの引数ありコンストラクタを呼び出しする、引数を３にする
		System.out.println("動物の数：" + dog2.count); // 動物の数を出力する
		
		
		LocalDateTime now = LocalDateTime.now(); // 現在の時間を取得する
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); // 表示の形の指定
		String formattedDateTime = now.format(formatter); // 指定の形を変換する
		System.out.println("現在の日時: " + formattedDateTime); // 現在の時間を出力する
	}

}
