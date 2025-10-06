package curriculum_G_pro;

import java.util.Random; // ランダムの数値を宣言する

public class Hero extends Character { // Characterクラスを継承したHeroクラス(サブクラス
	// コンストラク、キャラクター生成時のステータスのランダムの範囲を設置
	public Hero(String name) {
        super(
            name,
            new Random().nextInt(1000), // HP
            new Random().nextInt(1000), // MP
            new Random().nextInt(500),  // 攻撃力
            new Random().nextInt(1000), // 素早さ
            new Random().nextInt(100)   // 防御力
        );
    }
	
	 // ステータスを出力する
    public void showStatus() {
        System.out.println("こんにちは 「 " + getName() + " 」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
        System.out.println(); 
        System.out.println("さあ冒険に出かけよう！");
    }
}
