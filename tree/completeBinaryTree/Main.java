package tree.completeBinaryTree;

public class Main {
    public static void main(String[] args) {
        CompleteBinaryTree completeBinaryTree = new CompleteBinaryTree();

        // 빈 노드는 -1로 대체합니다.
        int[] arr = new int[]{-1, 9, 7, 15, 4, 8, 11};
        completeBinaryTree.printAll(arr);
    }
}
