package tree.BinarySearchTree;
import tree.traversal.Traversal;

public class Main7 {
    public static void main(String[] args) {
        /* binary tree
         *                 13
         *         9               19
         *     5       11       15     20
         *   1   7   10  12   14  17
         */
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int arr[] = new int[]{13, 9, 19, 5, 11, 15, 20, 1, 7, 10, 12, 14, 17};

        for (int v : arr) {
            binarySearchTree.insert(v);
        }

        new Traversal().postorder(binarySearchTree.getRoot());
    }
}

