package curriculum_I;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
// 実行用クラス
public class Main {

	public static void main(String[] args) {
	// 都道府県の配列を作成する
	Prefecture[] prefectures = {
		new Prefecture("北海道", "札幌市", 83424),
		new Prefecture("青森県", "青森市", 9646),
		new Prefecture("岩手県", "盛岡市", 15275),
		new Prefecture("宮城県", "仙台市", 7282),
		new Prefecture("秋田県", "秋田市", 11638),
		new Prefecture("山形県", "山形市", 9323),
		new Prefecture("福島県", "福島市", 13784),
		new Prefecture("茨城県", "水戸市", 6097),
		new Prefecture("栃木県", "宇都宮市", 6408),
		new Prefecture("群馬県", "前橋市", 6362),
		new Prefecture("埼玉県", "さいたま市", 3798)
	};
	
	Scanner scanner = new Scanner(System.in); // 入力を準備する
	
	// 入力案内を出力する
	System.out.println("都道府県番号をカンマ区切りで入力してください（例：8,5,9）:");
	String inputNumbers = scanner.nextLine();
	
	System.out.println("昇順または降順を入力してください（例：昇順 or 降順）:");
	String order = scanner.nextLine();
	
	// ","で分割して配列に変換
	String[] numberStrings = inputNumbers.split(",");
	List<Prefecture> selectedPrefectures = new ArrayList<>();
	
	// 入力された番号に対応する都道府県の分岐を設定する
	for (String numStr : numberStrings) {
		int index = Integer.parseInt(numStr.trim());
		if (index >= 0 && index < prefectures.length) {
			selectedPrefectures.add(prefectures[index]);
		} else {
			System.out.println("番号 " + index + " は無効です。");
		}
	}
	
	// 並び替え
	if (order.equals("昇順")) {
		selectedPrefectures.sort(Comparator.comparingDouble(Prefecture::getArea));
	} else if (order.equals("降順")) {
		selectedPrefectures.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
	} else {
		System.out.println("昇順または降順を正しく入力してください。");
		scanner.close();
		return;
	}
	
	// 結果を出力する
	System.out.println("\n▼結果▼\n");
	for (Prefecture p : selectedPrefectures) {
		p.printInfo();
	}
	scanner.close();
  }
}
