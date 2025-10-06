package curriculum_L;
/*
 * 問題1：インスタンスフィールドに「lastName」を追加しましょう
 * 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
 * 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
 */

// 設計図クラス
public class Person {
	// 個人情報の変数を定義する
	private String firstName; // 名字
    private String lastName;  // 名前
    private int age;          // 年齢
    private double height;    // 身長
    private double weight;    // 体重
    
    private static int count = 0; // 人数カウント
    
    // コンストラクタ、初期化する
    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName; 
        this.age = age;
        this.height = height;
        this.weight = weight;
        
        Person.count++; // 人数をカウントアップ 
    }
    
    // フルネームを返す
    public String fullName() {
        return this.firstName + this.lastName;
    }
    
    // BMIを計算して返す
    public double bmi() {
        return this.weight / (this.height * this.height);
    }
    
    //  結果を出力する
    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
        System.out.println();
    }
    
    // 合計人数を出力する
    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }

}
