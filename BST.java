class BST {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int no) {
            data = no;
            left = null;
            right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void insert(int data) {
        root = insertdata(root, data);
    }

    Node insertdata(Node root, int no) {
        if (root == null) {
            root = new Node(no);
            return root;
        }

        if (no < root.data) {
            root.left = insertdata(root.left, no);
        } else if (no > root.data) {
            root.right = insertdata(root.right, no);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
    }
}
