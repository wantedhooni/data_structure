package algorithm.bubble;

public class BubbleSort {
    public int[] sort(int[] arr) {
        // 마지막은 이미 요소 1개를 제외한 나머지는 모두 정렬된 상태이므로 배열의 길이 -1 만큼 반복한다.
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
