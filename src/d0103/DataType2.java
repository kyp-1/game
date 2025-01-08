package d0103;

public class DataType2 {

	public static void main(String[] args) {
		int i = 1;
		byte b = (byte)i;
		i = b;  //i (int)b; 의 생략
		
		String str1 = i + "";
		System.out.println(str1);  //숫자를 문자로
		
		i = Integer.parseInt(str1);
		System.out.println(i); //문자를 숫자로

	}
}
