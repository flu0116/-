package curriculum_A;

public class Qes13 {

	public static void main(String[] args) {
		
		int age = 24; // 年齢
		double height = 168.5; // 身長
				
		String newAge = String.valueOf(age); // 年齢をString型に変換
		String newHeight = String.valueOf(height); // 身長をString型に変換
		
		int thirdAge = Integer.parseInt(newAge); // Int型に変換
		double thirdHeight = Double.parseDouble(newHeight); // double型に変換
		
		System.out.println(thirdAge);
		System.out.println(thirdHeight);
		
		boolean a = (thirdAge >= 25) || (thirdHeight >= 160); // 年齢と身長の判定条件を付き
		
		System.out.println(a);
	

	}

}
