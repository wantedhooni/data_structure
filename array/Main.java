package array;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        //

        // 순차적으로 1 ~ 10 삽입 후 역순으로 출력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(arr[j]);
                return;
            }
            System.out.print(arr[j] + ",");
        }
    }
}
