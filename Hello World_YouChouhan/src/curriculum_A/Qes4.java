package curriculum_A;

public class Qes4 {

	public static void main(String[] args) {
		byte b =10;   
		short s = 100; 
		int i = 1000; 
		long l = 10000L; 
		float f = 9.5f; 
		double d = 10.5;
		char c = 'a'; 
	    String str = "ハロー";  
		boolean bool = true;  
		
		System.out.println(b + s + i + l); // 11110
		System.out.println(f + d); // 20
		System.out.println(c + " " + str + " " + bool); // a ハロー true
		System.out.println(b + s + i + l + f + d); // 数字をすべて足す
		System.out.println(b * s * i * l); // 小数点以外の数字を全てかける
		System.out.println(d / 100); // 10.5割る100をする
		System.out.println(b - s); // 10引く100をする 
		
	}

}
