package recursive;

import java.util.Scanner;

public class chapter4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("피보나치 수열 : " + fibonacci(i));
		}
	}

	private static int fibonacci(int num) {
		if (num <= 1) {
			return num;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}
}
