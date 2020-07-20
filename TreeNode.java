package TreeNode;

public class TreeNode{

    private int dataNode;
    private TreeNode leftChild;
    private TreeNode rightChild;



    public TreeNode(int dataNode){
        this.dataNode = dataNode;
    }
    public int getData(){
        return dataNode;
    }
    public TreeNode getLeftChild(){

        return leftChild;
    }

    public TreeNode getRightChild(){

        return rightChild;
    }


    public void setLeftChild(TreeNode leftChild){

        this.leftChild = leftChild;

    }

    public void setRightChild(TreeNode rightChild){

        this.rightChild = rightChild;

    }

}
