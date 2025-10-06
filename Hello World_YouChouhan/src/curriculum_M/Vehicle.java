package curriculum_M;
/*
 * 問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
 * 問題2：CarクラスとBicycleクラスを作成しましょう。
 * 問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
 * 問題4：MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス
 * 「bicycle」の所有者を「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
 * 問題5：セットできたら、ownerをコンソールに出力してください。
 */

// 設計図クラス、乗り物の親クラス
public class Vehicle {
	
	// 変数を定義する
	private String owner;
	
	// 数値を取り出す
	public String getOwner() {
		return owner;
	}
	// 数値をセットする
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
