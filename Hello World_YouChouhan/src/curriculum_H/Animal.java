package curriculum_H;
/*
 * コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 * ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
 * 
 * コンソールに文字を入力してください
 * 動物名：ライオン
 * 体長：2.1m
 * 速度：80km/h
 * 学名：パンテラ レオ
 * 
 * 動物名：ゾウ
 * 体長：3.2m
 * 速度：40km/h
 * 学名：ロキソドンタ・サイクロティス
 * 
 * 動物名：パンダ
 * 体長：1.9m
 * 速度：30km/h
 * 学名：アイルロポダ・メラノレウカ
 * 
 * 動物名：チンパンジー
 * 体長：0.94m
 * 速度：25km/h
 * 学名：パン・トゥログロディテス
 * 
 * 動物名：シマウマ
 * 体長：2.4m
 * 速度：65km/h
 * 学名：チャップマンシマウマ
 * 
 * 動物名：インコ
 * 体長：0.1m
 * 速度：50km/h
 * 学名：不明
 */

// 設計図クラス
public class Animal {
	// フィールド、変数を定義する
	private String name; // 動物名
	private double length; // 体長
	private int speed; // 速度
	private String scientificName; // 学名
		
	// コンストラクタ,それぞれの初期値を設定
	public  Animal(String name, double length, int speed, String scientificName) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
	}
	// それぞれの数値を取り出す
	public String getName() {
		return name;
	}

	public double getLength() {
		return length;
	}

	public int getSpeed() {
		return speed;
	}

	public String getScientificName() {
		return scientificName;
	}
	// 出力する
	public void printInfo() {
		System.out.println("動物名：" + name);
		System.out.println("体長：" + length + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
		System.out.println(); // 改行
	}


}
