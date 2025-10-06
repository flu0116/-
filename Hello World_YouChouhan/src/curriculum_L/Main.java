package curriculum_L;

public class Main {

	public static void main(String[] args) {
		// 新しいオブジェクト作成する
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60.0);
        Person person2 = new Person("山田", "花子", 22, 1.5, 40.0);
		
		// 結果を出力する
		person1.print();
		person2.print();
		
		// 人数を出力
		Person.printCount(); 

	}

}