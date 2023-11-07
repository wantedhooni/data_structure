package array;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        // 오름차순으로 정렬하되, 중복 제거된 값은 0으로 출력
        // 삽입 정렬 사용
        int[] arr = {3, 4, 1, 8, 9, 3, 4, 2, 7, 5, 10, 6, 10, 6};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j-1]) {
                    continue;
                }

                if (arr[j] == arr[j-1]) {
                    arr[j-1] = 0;
                    continue;
                }

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
