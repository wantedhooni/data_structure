package linkedList;

public class SLLInsertionMain {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(85);
        singlyLinkedList.append(59);
        singlyLinkedList.append(70);
        singlyLinkedList.append(23);
        singlyLinkedList.append(65);

        System.out.print("단일 연결 리스트: ");
        singlyLinkedList.printAll();
    }
}
