public class Treenode {
    private int sources;
    private Treenode leftChild;
    private Treenode rightChild;

    public Treenode get(int value) {
        if (value == sources) {
            return this;
        }
        if (value < sources) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }
        return null;
    }
    public int min(){
        if(leftChild == null){
            return sources;
        }else{
            return leftChild.min();
        }
    }
    public int max(){
        if(rightChild == null){
            return sources;
        }else{
            return rightChild.max();
        }
    }
    public void insert(int value){
        if(value == sources){
            return;
        }
        if(value<sources){
            if(leftChild == null){
                leftChild = new Treenode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null){
                rightChild = new Treenode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }
    public void traverseInorder(){
        if(leftChild != null){
            leftChild.traverseInorder();
        }
        System.out.print(sources + "," );
        if(rightChild != null){
            rightChild.traverseInorder();
        }
    }
    public int getSources() {
        return sources;
    }
    public void setSources(int sources) {
        this.sources = sources;
    }
    public Treenode getLeftChild(){
        return leftChild;
    }
    public Treenode(int sources) {
        this.sources = sources;
    }
    public void setleftChild(Treenode leftChild) {
        this.leftChild = leftChild;
    }
    public  Treenode getRightChild(){
        return rightChild;
    }

    public void setRightChild(Treenode rightChild) {
        this.rightChild = rightChild;
    }
    public String toString(){
        return "sources = "+ sources;
    }
}


