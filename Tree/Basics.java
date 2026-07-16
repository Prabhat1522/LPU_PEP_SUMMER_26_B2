public class Basics {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void Inorder(Node root) {
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    static void Postorder(Node root) {
        if(root == null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    static int countNodes(Node root) {
        if(root == null) return 0;
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return lc + rc + 1;
    }
    static int countLeafNodes(Node root) {
        if(root == null) return 0;
        if(root.left==null && root.right == null) return 1;
        int ll = countLeafNodes(root.left);
        int rl = countLeafNodes(root.right);
        return ll + rl;
    }
    static int height(Node root) {
        if(root == null) return -1;
        int lh = height(root.left);
        int rh = height(root.right);
        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.print("Preorder: ");
        preorder(root);

        System.out.println();

        System.out.print("Inorder: ");
        Inorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        Postorder(root);

        System.out.println();

        System.out.print("Number of Nodes: ");
        System.out.print(countNodes(root));

        System.out.println();

        System.out.print("Number of Leaf Nodes: ");
        System.out.print(countLeafNodes(root));

        System.out.println();

        System.out.print("Height of Tree: ");
        System.out.print(height(root));
        

        
    }

}