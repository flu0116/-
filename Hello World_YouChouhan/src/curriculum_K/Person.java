package curriculum_K;
/*
 * 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
 * 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
 * 問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
 * 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
 * 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
 * 問題6：クラスメソッド「printCount」を呼び出してください
 */

// 設計図クラス
public class Person {
	// フィールド,変数を定義する
	private String name;   // 名前
    private int age;       // 年齢
    private double height; // 身長
    private double weight; // 体重
    
    private static int count = 0; // 合計人数の変数の定義と初期化する
    
    // コンストラクタ、初期化する
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
        count++; // 作る人数によって増加する
    }
    
    // BMIを計算して返す
    public double bmi() {
        return this.weight / (this.height * this.height);
    }
    
    // 結果を出力する
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
        System.out.println(); // 改行
    }
    
    // 人数を出力する
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}
