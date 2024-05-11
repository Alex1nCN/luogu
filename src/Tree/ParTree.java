package Tree;

public class ParTree {
    int maxsize,n;
    ParTreeNode[] parTreeNodes;

    public ParTree(int maxsize){
        this.n=0;
        this.maxsize=maxsize;
        this.parTreeNodes=new ParTreeNode[maxsize];
    }

    public void addNode(ParTreeNode p){
        if(n==0){
             p.parent=-1;
             this.parTreeNodes[n]=p;
             n++;
        }else if(n==this.maxsize){
            System.out.println("the tree is full!!");
        }else{
            this.parTreeNodes[n]=p;
            n++;
        }
    }

    public void printParTree(){
        for(int i=0;i<n;i++){
            System.out.println(i+"\t\t"+this.parTreeNodes[i].info+"\t\t"+this.parTreeNodes[i].parent);
        }
    }

    public static void main(String[] args) {
        ParTree PT=new ParTree(10);
        PT.addNode(new ParTreeNode('A',-1));
        PT.addNode(new ParTreeNode('B',0));
        PT.addNode(new ParTreeNode('D',1));
        PT.addNode(new ParTreeNode('E',1));
        PT.addNode(new ParTreeNode('H',3));
        PT.addNode(new ParTreeNode('I',3));
        PT.addNode(new ParTreeNode('J',3));
        PT.addNode(new ParTreeNode('C',0));
        PT.addNode(new ParTreeNode('F',7));
        PT.addNode(new ParTreeNode('G',7));
        System.out.println("index"+"\t"+"info"+"\t"+"parent");
        PT.printParTree();
    }

}
