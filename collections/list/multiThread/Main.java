package collections.list.multiThread;

public class Main {
    public static void main(String[] args) {
        BankBook bankBook = new BankBook();

        // Thread 클래스를 상속받은 Person 클래스 세 개를 만들어서 호출합니다.
        for (int i = 0; i < 3; i++) {
            String name = "Person" + i;
            new Person(bankBook, name).start();
        }
    }
}
