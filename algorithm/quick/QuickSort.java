package algorithm.quick;

public class QuickSort {
    public void quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;

        // 배열의 가운데 요소를 pivot으로 잡는다.
        int pivot = arr[(start + end) / 2];

        while (left < right) {
            // pivot의 좌측은 pivot보다 작은 값만 두고 큰 값을 찾는다.
            while (arr[left] < pivot) {
                left++;
            }

            // pivot의 우측은 pivot보다 큰 값만 두고 작은 값을 찾는다.
            while (arr[right] > pivot) {
                right--;
            }

            // left, right 교차되면 분할을 멈춘다.
            if (left >= right) {
                break;
            }

            // left, j가 pivot값과 같으면 i만 오른쪽으로 한칸 이동 시킨다.
            if (arr[left] == pivot && arr[right] == pivot) {
                left++;
                continue;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // pivot 기준으로 좌-우 다시 정렬
        quick(arr, start, left - 1);
        quick(arr, left + 1, end);
    }
}
