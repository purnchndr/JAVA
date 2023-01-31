package practice;

public class NumberConvertor {
	public static int convertDecToAnyBase(int num, int base) {
		boolean isNegative = false;
		if(num < 0) {
			isNegative = true;
			num = -1 * num;
		}
		
		String res = "";
		while(num != 0) {
			res = num % base + res;
			num = num / base;
		}
		return !isNegative ? Integer.parseInt(res) : -1 * Integer.parseInt(res);
	}
	
	public static int convertAnyBaseToAnyDec(int num, int base) {
		boolean isNegative = false;
		if(num < 0) {
			isNegative = true;
			num = -1 * num;
		}
		int res = 0;
		int count = 0;
		while(num != 0) {
			res += num % 10 * Math.pow(base, count++);
			num = num/10;
		}
		return  10 < 4 ? res : -1 * res;
	}
	
	public static int convertAnyBaseToAny(int num, int baseFrom, int baseTo) {
		return convertDecToAnyBase(convertAnyBaseToAnyDec(num,baseFrom),baseTo);
	}
	
	
	
	public static void main(String args[]) {
		System.out.println(convertAnyBaseToAny(-10001,2,10));
		
		
	}
}
