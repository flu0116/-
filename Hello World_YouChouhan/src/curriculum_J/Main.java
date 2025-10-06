package curriculum_J;

// 実行用クラス
public class Main {

	public static void main(String[] args) {
		// weightを引数に追加してインスタンスを生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("田中花子", 25, 1.6, 55);
		Person person3 = new Person("佐藤健", 30, 1.8, 70);
		
		// 結果を出力する
		person1.print();
		person2.print();
		person3.print();
		
		Person.printTotal(3); // 合計人数を出力する

	}

}
