package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] treeValues = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for(int value: treeValues){
            addNode(value, root);
        }

        dfs(root);
    }

    public static void addNode(int nodeValue, Node root){

        Node nextNode = root;
        Node currentNode = null;

        while(nextNode != null){
            currentNode = nextNode;

            if(nodeValue < currentNode.getValue())
                nextNode = currentNode.getLeftSon();
            else
                nextNode = currentNode.getRightSon();
        }

        if (nodeValue < currentNode.getValue())
            currentNode.setLeftSon(new Node(nodeValue));
        else
            currentNode.setRightSon(new Node(nodeValue));

    }

    public static void dfs(Node node){
        if (node == null)
            return;

        dfs(node.getLeftSon());
        System.out.println(node.getValue() + " ");
        dfs(node.getRightSon());
    }
}