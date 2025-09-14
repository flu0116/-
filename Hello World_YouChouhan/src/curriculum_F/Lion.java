package curriculum_F;
// 実行用クラス
public class Lion {

	public static void main(String[] args) {
		Animal lion = new Animal(); // Animalクラスからクラスからコンストラクタを呼び出しする
		
		// setterでそれぞれ値を代入する
		lion.setName("ライオン"); // 名前を代入する
		lion.setLength(2.1); // 長さを代入する
		lion.setSpeed(80); // 速度を代入する
		
		// getterでそれぞれの値を取り出して出力する
		System.out.println("動物名:" + lion.getName()); 
		System.out.println("体長:" + lion.getLength() + "m");  
		System.out.println("速度:" + lion.getSpeed() + "km/h");  

	}

}
