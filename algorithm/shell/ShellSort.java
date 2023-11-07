package algorithm.shell;
import java.util.Arrays;

public class ShellSort {
    public void sort(int[] arr) {
        int length = arr.length;

        System.out.println(String.format("초기 배열: %s \n", Arrays.toString(arr)));
        for (int gap = length / 2; gap > 0; gap /= 2) { // ----- (1)
            System.out.println("---");
            System.out.println(String.format("간격 %s(으)로 배열을 나눕니다.", gap));

            for (int startIndex = 0; startIndex < gap; startIndex++) { // ----- (2)
                this.insertionSortByGap(arr, gap, startIndex);
            }
        }
        System.out.println("---");
    }

    private void insertionSortByGap(int[] arr, int gap, int startIndex) {
        for (int i = startIndex + gap; i < arr.length; i += gap) { // ----- (3)
            int j;
            int temp = arr[i];

            for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap) { // ----- (4)
                arr[j + gap] = arr[j];
            }
            arr[j + gap] = temp;
        }
        System.out.println(String.format("정렬 진행 후 배열: %s", Arrays.toString(arr)));
    }
}