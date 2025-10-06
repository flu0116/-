package curriculum_G_pro;
/*
 * 名前を入力したら下記がコンソールに出力されるように作ってください
 * 条件：数値は毎回変わるように作ってください
 * サブクラスを使用してください
 * スーパークラスを使用してください
 * getterとsetterを使用してください
 * packageを2つ作ってメインと処理を分けてください
 * 命名する場合は規則にのっとってください
 * コンストラクタを使用してください
 * 
 * こんにちは 「 名前 」 さん
 * ステータス
 * HP：849
 * MP：862
 * 攻撃力：375
 * 素早さ：937
 * 防御力：24
 * 
 * さあ冒険に出かけよう！
 */

// キャラクターの共通情報を持つスーパークラス
public class Character {
	// 共通の属性の変数を別々定義する
	private String name; // 名前
    private int hp; // ㏋
    private int mp; // MP
    private int attack; // 攻撃力
    private int speed; // 素早さ
    private int defense; // 防御力
    
    // コンストラクタ、各ステータスを初期化する
    public Character(String name, int hp, int mp, int attack, int speed, int defense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.speed = speed;
        this.defense = defense;
    }
    
    // それぞれの数値を代入し、取り出す
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

}
