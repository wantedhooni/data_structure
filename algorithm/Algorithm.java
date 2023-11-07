package algorithm;

public class Algorithm {
     public int factorial(int num) {
         if (num <= 1) {
             return 1;
         }
         return num * factorial(--num);
    }
    /**
     * 하노이의 탑
     * 3개의 축(A, B, C)과 크기가 다른 N개의 원반이 있다.
     * 한번에 하나의 원반만 움직일 수 있다.
     * 자신보다 작은 원반을 아래에 둘 수 없다.
     * 맨 위 원반만 움직일 수 있다.
     * 원반 번호는 위에서 부터 1, 2, 3, ... 순으로
     *
     * |    |    |
     * 1    |    |
     * |    |    |
     * 2    |    |
     * |    |    |
     * 3    |    |
     * |    |    |
     *
     * A -> C축으로 모든 원반을 옮겨보자.
     */
    public void hanoi(int disks, String begin, String middle, String end) {
        if (disks == 1) {
            System.out.println(String.format("1번 원반을 %s 기둥으로 옮깁니다.", end));
            return;
        }
        hanoi(disks - 1, begin, end, middle);
        System.out.println(String.format("%s번 원반을 %s 기둥으로 옮깁니다.", disks, end));
        hanoi(disks - 1, middle, begin, end);
    }
}
