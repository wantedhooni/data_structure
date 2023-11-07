package tree.BinarySearchTree;
import queue.linkedlist.LinkedListQueue;

public class BinarySearchTree {
    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
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

    /**
     * 재귀 함수를 사용하는 방법
     * @param root
     * @param value
     * @return
     */
    public Node search(Node node, int value) {
        if (node == null) {
            return null;
        } else if (node.getValue() == value) {
            return node;
        } else if (node.getValue() > value) {
            return search(node.getLeftChild(), value);
        } else {
            return search(node.getRightChild(), value);
        }
    }

    /**
     * 반복문을 사용하는 방법
     */
    public Node search(int value) {
        if (this.root == null) {
            return null;
        }

        Node target = this.root;
        while (target != null && target.getValue() != value) {;
            if (target.getValue() > value) {
                target = target.getLeftChild();
            } else {
                target = target.getRightChild();
            }
        }
        return target;
    }

    /**
     * 삽입
     * 1. 루트가 null인 경우
     * 2. 삽입 할 값이 루트보다 작은 경우
     * 3. 삽입 할 값이 루트보다 클 경우
     * -> 삽입 할 위치를 구한 다음 target이 null이면 삽입 할 위치이므로 부모의 노드에서 target을 연결한다.
     * @param value
     */
    public void insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            return;
        }

        Node target = this.root;
        Node parent = null;

        while (target != null) {
            parent = target;
            if (target.getValue() == value) {
                System.out.println(String.format("%s는(은) 중복된 값입니다. 삽입을 중단합니다.", value));
                break;
            }

            if (target.getValue() > value) {
                target = target.getLeftChild();

                if (target == null) {
                    parent.setLeftChild(new Node(value));
                }
            } else {
                target = target.getRightChild();

                if (target == null) {
                    parent.setRightChild(new Node(value));
                }
            }
        }
    }

    /**
     * node 인자 기준으로 오른쪽 서브트리의 리프노드 가져오기.
     * @param node
     * @return
     */
    public Node getMinimumNode(Node node) {
        if (node == null) {
            return null;
        }

        if (node.getLeftChild() != null) {
            return getMinimumNode(node.getLeftChild());
        }

        return node;
    }

    /**
     * 삭제
     * @param value
     */
    public Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (root.getValue() == value) {
            if (root.getLeftChild() == null && root.getRightChild() == null) {  // 자식 노드가 모두 없는 경우
                root = null;
                return null;
            } else if (root.getLeftChild() != null && root.getRightChild() == null) { // 왼쪽 자식 노드만 존재하는 경우
                Node left = root.getLeftChild();
                root = null;
                return left;
            } else if (root.getLeftChild() == null && root.getRightChild() != null) { // 오른족 자식 노드만 존재하는 경우
                Node right = root.getRightChild();
                root = null;
                return right;
            } else { // 자식 노드가 2개인 경우
                Node children = getMinimumNode(root.getRightChild());
                root.setValue(children.getValue());
                root.setRightChild(delete(root.getRightChild(), children.getValue()));
            }
        }

        if (root.getValue() > value) {
            root.setLeftChild(delete(root.getLeftChild(), value));
        } else {
            root.setRightChild(delete(root.getRightChild(), value));
        }

        return root;
    }
}
