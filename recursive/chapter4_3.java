package recursive;

public class chapter4_3 {
	public static void main(String[] args) {
		System.out.println("5! => " + factorial(5));
		System.out.println("6! => " + factorial(6));
		System.out.println("7! => " + factorial(7));
	}

	private static int factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * factorial(--num);
	}
}
