import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

public class BST {

    static Node insert(Node root, int x) {

        if (root == null) {
            return new Node(x);
        }

        if (x < root.data) {
            root.left = insert(root.left, x);
        } else {
            root.right = insert(root.right, x);
        }

        return root;
    }

    static Node create() {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter node (-1 to stop): ");
        int x = sc.nextInt();

        while (x != -1) {

            root = insert(root, x);

            System.out.print("Enter node (-1 to stop): ");
            x = sc.nextInt();
        }

        return root;
    }

    static void inorder(Node root) {

        if (root != null) {

            inorder(root.left);

            System.out.print(root.data + " ");

            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = create();

        System.out.print("\nInorder Traversal: ");

        inorder(root);
    }
}