public class BST {
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            this.left=this.right.data
        }
        
    }
    Node insertBST(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(root.data<data){
            root.right=insertBST(root.right, data)
        }else if(root.data>data){
            root.left=insertBST(root.left, data)
        }
        return root;
    }
    Node deleteBST(Node root,int data){
        if (data<root.data){
            root.left=deleteBST(root.left, data)


        }
        else if(data>root.data){
            root.right=deleteBST(root.right, data)
        }
        
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right ==null){
                return root.left
            }

        }
        return root
    }
    int findMIN(Node root){
        int min =root.data;
        while(root.left!=null){
            root=root.left;
            min=root.data;
        }

    }

    public static void main(String[] args) {
        Node root =insertBST(null,10);
        root=insertBST(root,20);
        
    }
}