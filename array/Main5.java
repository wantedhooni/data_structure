package array;

public class Main5 {
    public static void main(String[] args) {
        // 문자열 잘라서 배열에 넣고 역순으로 출력
        String str = "Abradacadarba ";
        String[] arr = str.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf(arr[i]);
        }
    }
}
