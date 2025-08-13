package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes１_７ {

	public static void main(String[] args) {
/*      Q1_3
 *      Q1 ログイン時の入力チェックシステムを下記条件で作成してください
 *      ・コンソールにユーザー名を入力できるようにしてください
 *      ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
 *      ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
 *      ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
 *      
 *      Q2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
 *      
 *      Q3 じゃんけんのシステムを作成してください
 */
		Scanner scanner = new Scanner(System.in); // 入力の準備

		String username = scanner.nextLine(); // ユーザー名の入力
		
		if (username == null || username.trim().isEmpty()) { // 条件のチェック、空白の場合
			System.out.println("名前を入力してください"); // 空白を入力する場合の提示
			return; // 最初に戻る
		} else if (username.length() > 10) { //条件のチェック、10文字を超えた場合
			System.out.println("名前を10文字以内にしてください"); // 10文字を超えた場合の提示
			return; // 最初に戻る
		} else if (!username.matches("^[a-zA-Z0-9]+$")) { // 入力条件と違った場合
			System.out.println("半角英数字のみで名前を入力してください"); // 入力条件が違った場合の提示
			return; // 最初に戻る
		} else{ // 上すべての入力条件を該当しない場合
			System.out.println("ユーザー名「" + username + "」を登録しました"); // 入力成功の提示
		}
		
		String[] hands = {"「グー」" , "「チョキ」" , "「パー」"} ; // 配列でじゃけんの手を用意する
		Random rand = new Random(); // ランダムを宣言する
	
		int count = 0; // 試行回数を宣言し、初期化する
		
		while (true) { // 条件をクリアまでループ
			String userHand = hands[rand.nextInt(3)]; // ユーザーの手を3つの配列でランダムで出す
			String computerHand = hands[rand.nextInt(3)]; // 相手の手を3つの配列でランダムで出す
			
			
		    System.out.println(username + "の手は" + userHand); // ユーザーの手を出力
		    System.out.println("相手の手は" + computerHand); // 相手の手を出力
		
		count++; // 試行加算
		
        if (userHand.equals(computerHand)) { // あいこの場合
			System.out.println("DRAW あいこです。もう一回しましょう！"); // あいこの出力
			continue; // ループ
		} 
        
        if ((userHand.equals(hands[0]) && computerHand.equals(hands[1])) || 
			(userHand.equals(hands[1]) && computerHand.equals(hands[2])) || 
			(userHand.equals(hands[2]) && computerHand.equals(hands[0]))) { // 勝ちの場合
			System.out.println("やるやん。\n次は俺にリベンジさせて。"); // 勝の場合の出力
			break; // 勝ったらループ終了
		} 
        
        if (userHand.equals(hands[1]) && computerHand.equals(hands[0])) { // 負けた場合（各条件で出力メッセージが違う）
			System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
		} else if (userHand.equals(hands[2]) && computerHand.equals(hands[1])) {
			System.out.println("俺の勝ち！\nたかがじゃんけん、そうおもってないですか？\nそれやったら次も、おれがかちますよ");
		} else if (userHand.equals(hands[0]) && computerHand.equals(hands[2])) {
			System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたらなにかがみえてくるはずです。");
		}
		
		}
		System.out.println("勝つまでにかかった合計回数は" + count + "回です"); // 試行回数を出力
		
//      Q4 for文を使用して下記の通りに出力してください
		
		for (int i = 1; i <= 9; i++) { // 行を表すループ、9まで、毎回+1
			for (int j = 1; j<=9; j++) { // 列を表すループ、9まで、毎回+1
				System.out.printf("%02d * %02d = %02d", i, j, i * j); // 数字を2桁で式を表す 
				if (j != 9) { // 条件式を9列以外の時
					System.out.print(" || "); // ||線を付く
				}
			}
			System.out.println(); // 1行終わったら改行
		}
		
//      Q5 for文を使用して下記の通りに出力してください
		
		for (int j = 1; j <= 9; j++) { // 行を表すループ、9まで、毎回+1
			for (int i = 1; i<=20; i++) { // 段を表すループ、20まで、毎回+1
				System.out.printf("%03d * %03d = %03d", i, j, j * i); // 3桁の数字で式を表す
				if (i != 20) { // 条件式20列以外の時
					System.out.print(" || "); // ||線を付く
				}
			}
			System.out.println(); // 1行終わったら改行
		}
		
//      Q6 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		
		String input = scanner.nextLine(); // 入力を受け取る
		
		System.out.println("商品を「、」区切りで入力してください："); // 入力の説明を出力する
		String[] goods = input.split("、"); // 『、』で入力を分割して、配列を作る
		
		for (String item : goods) { // 入力の配列から要素を取り出し、item宣言する
			int stock = rand.nextInt(12); // 在庫数を宣言し、0~11ランダムの数字となる
			
			switch (item) { // itemによって分岐処理を行う
			    case "テレビ": // テレビ、ディスプレイを同じ商品を扱いする場合
			    case "ディスプレイ": 
			    	/*
			    	 * 条件演算でディスプレイの場合は11引いたランダムの数字、
			    	 * そうでない場合はランダムの数字
			    	 */
				    int num = item.equals("ディスプレイ") ? (11 - stock) : stock; 
				    System.out.println(item + "の残り台数は" + num + "台です"); // 結果を出力
				    break;
				    
			    case "パソコン": // ほかの５種類の場合
			    case "冷蔵庫":
			    case "扇風機":
			    case "洗濯機":
			    case "加湿器":
			    	System.out.println(item + "の残り台数は" + stock + "台です"); // こちらのケースの出力
			    	break;
			    	
			    default:
			    	System.out.println("『" + item + "』は指定の商品ではありません"); // どちらでもないの出力
			}
		}
		
//      Q7 N人の生徒の成績を管理するプログラムを下記条件で作成してください
		
		int studentCount; // 生徒数を宣言する
		studentCount = scanner.nextInt(); // 生徒数を入力する
		
		do { // do-while文、最低一回実行する
			System.out.println("生徒の人数を入力してくだい（２以上）:"); // 入力前の提示
		    while (!scanner.hasNextInt()) { // 数値で入力チェック
		    	System.out.println("数値で入力してください");
		    	scanner.next();
		    }
		} while (studentCount < 2); // 分岐の条件式
		
		int [][] scores = new int[studentCount][4]; // 二次元配列で生徒番号と各科目を組合する
		
		// 各科目合計を宣言し、初期化する
		double totalEnglish = 0;
		double totalMath = 0;
		double totalScience = 0;
		double totalSocial = 0;
		
		for (int i = 0; i < studentCount; i++) { // for文の反復処理の条件を定義する
			System.out.println((i + 1) + "人目の『英語』の点数を入力してくだい："); // 英語の点数入力する提示
			scores[i][0] = scanner.nextInt(); // 英語の点数の入力
			
			System.out.println((i + 1) + "人目の『数学』の点数を入力してくだい："); // 数学の点数入力する提示
			scores[i][1] = scanner.nextInt(); // 数学の点数の入力
			
			System.out.println((i + 1) + "人目の『理科』の点数を入力してくだい："); // 理科の点数入力する提示
			scores[i][2] = scanner.nextInt(); // 理科の点数の入力
			
			System.out.println((i + 1) + "人目の『社会』の点数を入力してくだい："); // 社会の点数入力する提示
			scores[i][3] = scanner.nextInt(); // 社会の点数の入力
			
			totalEnglish += scores[i][0]; // すべての生徒の英語の点数
			totalMath += scores[i][1]; // すべての生徒の数学の点数
			totalScience += scores[i][2]; // すべての生徒の理科の点数
			totalSocial += scores[i][3]; // すべての生徒の社会の点数
		}
		
		for (int i = 0; i <studentCount; i++) { // 各生徒の平均点は計算のため、for文の反復処理の条件を定義する
			double avgStudent = ( scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3]) / 4.0; // 平均点はの計算式
			System.out.println((i + 1) + "人目の平均点は" + String.format("%.2f" , avgStudent) + "点です"); // 平均点はの出力、小数点以下2位を制限する
		}
		
		double avgEnglish =totalEnglish / studentCount; // 英語の平均点計算式
		double avgMath =totalMath / studentCount; // 数学の平均点計算式
		double avgScience =totalScience / studentCount; // 理科の平均点計算式
		double avgSocial =totalSocial / studentCount; // 社会の平均点計算式
		
		System.out.println("英語の平均点は" + String.format("%.2f", avgEnglish) + "点です"); // 英語の平均点を出力する
		System.out.println("数学の平均点は" + String.format("%.2f", avgMath) + "点です"); // 数学の平均点を出力する
		System.out.println("理科の平均点は" + String.format("%.2f", avgScience) + "点です"); // 理科の平均点を出力する
		System.out.println("社会の平均点は" + String.format("%.2f", avgSocial) + "点です"); // 社会の平均点を出力する
		
		double total = totalEnglish + totalMath + totalScience + totalSocial; // 全体の点数の計算式
		double avgAll = total / (studentCount * 4.0); // 全体の平均点計算式
		System.out.println("クラス全体の平均点は" + String.format("%.2f", avgAll) + "点です"); // 全体の平均点を出力する

	}

}
