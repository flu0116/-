package curriculum_G_main;

import java.util.Scanner; // 入力の代入する準備

import curriculum_G_pro.Hero; // curriculum_G_proパッケージのHeroクラスを読み込む宣言する

// 実行用クラス
public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); // 入力を準備する
			
			System.out.printf("名前を入力してください: "); // 入力提示を出力する
			String name = sc.nextLine(); // 入力された名前を代入する
			
			Hero hero = new Hero(name); // Heroクラスからクラスからコンストラクタを呼び出しする
			
			hero.showStatus(); // ステータスを表示する
			
			sc.close(); // 終了する
		}
}
