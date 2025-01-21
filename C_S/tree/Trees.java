package tree;

class Trees {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.left = this.right = null;
            this.data = data;
        }
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);

        System.out.println(root.data);
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);

        System.out.println(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        Trees tree = new Trees();

        System.out.println("Preorder Traversal:");
        tree.preorder(root);

        System.out.println("\nInorder Traversal:");
        tree.inorder(root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(root);
    }
}
