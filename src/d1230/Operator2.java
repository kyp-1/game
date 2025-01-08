package d1230;

public class Operator2 {

	public static void main(String[] args) {
		int num = 1; //1
		num = num + 1; //2
		num += 1; //3
		num++; //4
		++num; //5
		System.out.println(num++); //5 후술연산자
		System.out.println(num); //6
		
		num--; //5
		--num; //4
		num -= 1; //3
		num = num -1; //2
		System.out.println(--num); //1
	}
}
