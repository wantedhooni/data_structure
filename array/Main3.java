package array;

public class Main3 {
    // 배열 요소 안의 최소 값과 최대 값 구하기
    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 8, 5, 10, 1, 11, 2, 3, 6, 7, 30, 9};
        // 정렬을 사용하지 않음
        int min = arr[0];
        int max = arr[0];

        for (int k : arr) {
            if (min > k) {
                min = k;
            }
            if (k > max) {
                max = k;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);

        // 정렬 사용(버블정렬)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j-1]) {
                    continue;
                }

                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println("최소 값:" + arr[0]);
        System.out.println("최대 값:" + arr[arr.length - 1]);
    }
}
