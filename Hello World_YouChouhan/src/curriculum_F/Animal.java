package curriculum_F;
/*
 * 下記がコンソールに出力されるように作成してください
 * ※thisとsetterとgetterとフィールドを使ってください
 * 動物名：ライオン
 * 体長：2.1m
 * 速度：80km/h
 */

// 設計図クラス
public class Animal {
	
	private String name; // 名前を宣言し、初期化する
	private double length; // 長さを宣言し、初期化する
	private int speed; // 速度を宣言し、初期化する
	
	// 名前、長さ、速度にそれぞれ値を代入する
	public void setName(String name) { 
		this.name = name;
	}
	public void setLength(double length) { 
		this.length = length;
	}
	public void setSpeed(int speed) { 
		this.speed = speed;
	}
	// 名前、長さ、速度を代入した値を取り出す
	public String getName() {  
		return this.name;
	}
	public double getLength() { 
		return this.length;
	}
	public int getSpeed() { 
		return this.speed;
	}
}
