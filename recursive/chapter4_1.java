package recursive;

public class chapter4_1 {
	public static void main(String[] args) {
		System.out.println("결과: " + sum(100));
	}

	private static int sum(int range) {
		int result = 0;
		for (int i = 1; i <= range; i++) {
			result += i;
		}

		return result;
	}
}
