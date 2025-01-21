public class AVLTree {
    // Node class representing each node in the AVL tree
    public static class Node {
        Node left; // Left child
        Node right; // Right child
        int data; // Data stored in the node
        int height; // Height of the node

        // Constructor to initialize a new node
        Node(int data) {
            this.data = data; // Set the data
            this.height = 1; // Initial height of a new node is 1
            this.left = this.right = null; // Left and right children are null
        }
    }

    // =======================================================
    // Non-Helper Functions
    // =======================================================

    // Insert data into the AVL tree while maintaining balance
    public Node createBST(Node root, int data) {
        // 1. Perform normal BST insertion
        if (root == null) {
            return new Node(data); // Create and return a new node
        }

        if (data < root.data) {
            root.left = createBST(root.left, data); // Insert in the left subtree
        } else if (data > root.data) {
            root.right = createBST(root.right, data); // Insert in the right subtree
        } else {
            return root; // Duplicate values are not allowed
        }

        // 2. Update height of the current node
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // 3. Get balance factor to check for imbalance
        int balance = getBalance(root);

        // 4. Fix imbalances using rotations

        // Left Left Case
        if (balance > 1 && data < root.left.data) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && data > root.right.data) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && data > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && data < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; // Return the balanced root
    }

    // Perform an inorder traversal of the AVL tree
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left); // Visit left subtree
            System.out.print(root.data + " "); // Print current node
            inorder(root.right); // Visit right subtree
        }
    }

    // =======================================================
    // Helper Functions
    // =======================================================

    // Get the height of a node
    public int height(Node node) {
        if (node == null)
            return 0; // Null nodes have height 0
        return node.height;
    }

    // Calculate the balance factor of a node
    public int getBalance(Node node) {
        if (node == null)
            return 0; // Null nodes are balanced
        return height(node.left) - height(node.right); // Difference between left and right heights
    }

    // Perform a right rotation to fix a Left-Left (LL) imbalance
    public Node rightRotate(Node y) {
        Node x = y.left; // Set x as y's left child
        Node T2 = x.right; // Save x's right subtree

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // Return new root after rotation
    }

    // Perform a left rotation to fix a Right-Right (RR) imbalance
    public Node leftRotate(Node x) {
        Node y = x.right; // Set y as x's right child
        Node T2 = y.left; // Save y's left subtree

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // Return new root after rotation
    }

    // =======================================================
    // Main Method
    // =======================================================

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Node root = null;

        // Insert some values into the AVL tree
        root = tree.createBST(root, 10);
        root = tree.createBST(root, 20);
        root = tree.createBST(root, 30);
        root = tree.createBST(root, 40);
        root = tree.createBST(root, 50);
        root = tree.createBST(root, 25);

        // Print the inorder traversal of the AVL tree
        System.out.println("Inorder traversal of the AVL tree:");
        tree.inorder(root);
    }
}
