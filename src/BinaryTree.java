import java.util.Arrays;
import java.util.Stack;

public class BinaryTree {
    class Node {
        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }

/*
        @Override
        public String toString() {
            return "Value: " + String.valueOf(data)
                    + " Left -> " + (this.left == null ? "null" : String.valueOf(this.left.data))
                    + " right -> " + (this.right == null ? "null" + String.valueOf(this.right.data));
        }
*/

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + (left == null ? "null" : left.data) +
                    ", right=" + (right == null ? "null" : right.data) +
                    '}';
        }
    }

    Node root;

    public void insertBST(int val) {
        this.root = insertBST(val, root);
    }

    private Node insertBST(int val, Node node) {
        if (node == null) {
            return new Node(val);
        } else {
            if (val < node.data) {
                node.left = insertBST(val, node.left);
            } else {
                node.right = insertBST(val, node.right);
            }
        }
        return node;
    }

    public void insertRegular(int val, Node node) {
        if (node.left == null) {
            node.left = new Node(val);
        } else if (node.right == null) {
            node.right = new Node(val);
        }
    }

    public void print(Node node) {
        if (node == null) {
            return;
        }
        print(node.left);
        System.out.println(node.data);
        print(node.right);
    }

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftMax = 1 + maxDepth(node.left);
            int rightMax = 1 + maxDepth(node.right);
            return Math.max(leftMax, rightMax);
        }

    }

    public int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    public int minValue(Node node) {
        if (node.left == null) {
            return node.data;
        } else
            return minValue(node.left);
    }

    public boolean hasPathSum(Node node, int sum) {
        if (node == null) {
            return false;
        } else if (node.left == null && node.right == null && node.data == sum) {
            return true;
        } else {
            return (hasPathSum(node.left, sum - node.data) || hasPathSum(node.right, sum - node.data));
        }
    }

    int sum = 0;
    Stack<Integer> stack = new Stack<>();

    public void printPaths(Node node, int k) {
        if (node == null)
            return;
        sum = sum + node.data;
        stack.push(node.data);
        if (sum == k) {
            System.out.printf("Printing path: ");
            Arrays.toString(stack.toArray());

        }

        printPaths(node.left, k);
        printPaths(node.right, k);

        sum = sum - node.data;
        stack.pop();
    }

    public boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null) {
            return (a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right));
        }
        return false;
    }

    public boolean mirrorTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if(a.data == b.data)
        {
            if(mirrorTree(a.left,b.right) && mirrorTree(a.right,b.left))
            {
                return true;
            }
        }
        return false;
    }
}
