package tree.binaryTree;
import queue.linkedlist.LinkedListQueue;

public class BinaryTree {
    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
    }

    /**
     * 트리의 높이
     * @param node
     * @return
     */
    public int getHeight(Node node) {
        if (node != null) {
            return 1 + Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild()));
        }
        return 0;
    }

    /**
     * 노드 개수
     * @return
     */
    public int geNodeCount() {
        return 0;
    }


    /**
     * 너비 우선 탐색 (Breadth First Search)
     * 큐를 이용하여 탐색
     * @param root
     */
    public void bfs(Node root) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(root);

        while(!queue.empty()) {
            Node node = (Node) queue.dequeue();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }

            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
    }
}
