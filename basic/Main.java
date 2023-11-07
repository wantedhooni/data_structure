package basic;

public class Main {
    public static void main(String[] args) {
        int data1 = 3;
        int data2 = 1;
        int data3 = 9;
        int data4 = 5;
        int data5 = 10;

        int min = data1; // 최솟값을 담을 변수
        if (data2 < min) {
            min = data2;
        }

        if (data3 < min) {
            min = data3;
        }

        if (data4 < min) {
            min = data4;
        }

        if (data5 < min) {
            min = data5;
        }

        System.out.println("최솟값: " + min);
    }
}
