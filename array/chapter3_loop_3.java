package array;
import java.util.Random;

public class chapter3_loop_3 {
    public static void main(String[] args) {
		Random random = new Random();
		final int ARRAY_LENGTH = 100;

		int[] arr = new int[ARRAY_LENGTH];
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			arr[i] = random.nextInt(100);
		}

		int min = 0;
		int max = 0;

		for (int k : arr) {
			if (min > k) {
				min = k;
			} else if (max < k) {
				max = k;
			}
		}

		System.out.println("최소 값: " + min);
		System.out.println("최대 값: " + max);
	}
}
