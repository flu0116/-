package curriculum_H;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); // 入力を準備する

	System.out.println("コンソールに文字を入力してください:");
	
	String input = sc.nextLine();

	String[] animalData = input.split(","); // 入力の数値を,で分割する

	// 各動物のデータを処理
	for (String data : animalData) {
	// “：”で名前、体長と速度を分割する
	String[] info = data.split(":");
	String name = info[0];
	double length = Double.parseDouble(info[1]);
	int speed = Integer.parseInt(info[2]);
	
	// それぞれの場合の学名の分岐を設定する
	String scientificName = "";
	switch (name) {
		case "ライオン":
			scientificName = "パンテラ レオ";
			break;
		case "ゾウ":
			scientificName = "ロキソドンタ・サイクロティス";
			break;
		case "パンダ":
			scientificName = "アイルロポダ・メラノレウカ";
			break;
		case "チンパンジー":
			scientificName = "パン・トゥログロディテス";
			break;
		case "シマウマ":
			scientificName = "チャップマンシマウマ";
			break;
		default:
			scientificName = "不明";
			break;
	}
	Animal animal = new Animal(name, length, speed, scientificName); // Animalクラスからコンストラクタを呼び出しする
	
	animal.printInfo(); // 出力する
	 }
     }
}


