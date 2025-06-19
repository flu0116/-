package curriculum_A;

public class Qes9 {

	public static void main(String[] args) {
		String name = "山田太郎"; // 名前
		name = "鈴木一郎"; // 名前に再代入
		int age = 18; // 年齢
		age = 24; // 年齢に再代入
		double height = 170.5; // 身長
		height = 168.5; // 身長に再代入
		double weight = 62.2; // 体重
		weight = 64.2; // 体重に再代入
		String food = "寿司"; // 食べ物
		food = "オムライス"; // 食べ物に再代入
		double bmi = 22.6; // BMI
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "㎝です");
		System.out.println("体重は" + weight + "㎏です");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmi + "です");
		
		age *= 2; // 自己代入省略2をかける
		height *= 2; // 自己代入省略2をかける
		weight *= 2; // 自己代入省略2をかける
		bmi /= 2; // 自己代入省略2を割る
		
		System.out.println("初めまして" + name+ "です");
		System.out.println("年齢は" + age+ "歳です");
		System.out.println("身長は" + height+ "㎝です");
		System.out.println("体重は"+ weight+"㎏です");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmi + "です");
				

	}

}
