package curriculum_I;
/*
 * 0, "北海道:札幌市:83424"
 * 1, "青森県:青森市:9646"
 * 2, "岩手県:盛岡市:15275"
 * 3, "宮城県:仙台市:7282"
 * 4, "秋田県:秋田市:11638"
 * 5, "山形県:山形市:9323"
 * 6, "福島県:福島市:13784"
 * 7, "茨城県:水戸市:6097"
 * 8, "栃木県:宇都宮市:6408"
 * 9, "群馬県:前橋市:6362"
 * 10, "埼玉県:さいたま市:3798"
 * 
 * コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 * 都道府県がソートされてコンソールに出力されるように作ってください
 * ※Packageを2つ作ってください
 * 	※複数選択できるようにしてください
 */

// 設計図クラス
public class Prefecture {
	// フィールド、変数を定義する
	private String name;      // 都道府県名
	private String capital;   // 県庁所在地
	private double area;      // 面積（km²）
	
	public Prefecture(String name, String capital, int area) { // 
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	// それぞれの数値を取り出す
		public String getName() {
			return name;
		}

		public String getCapital() {
			return capital;
		}

		public double getArea() {
			return area;
		}
		
		// 出力する
		public void printInfo() {
			System.out.println("都道府県名：" + name);
			System.out.println("県庁所在地：" + capital);
			System.out.println("面積：" + area + "km2");
			System.out.println(); // 改行
		}

}
