package Tree;

public class SonTree {
    int maxsize,n;
    Node[] nodes;

    public  SonTree(int maxsize){
        this.maxsize=maxsize;
        n=0;
        nodes=new Node[maxsize];
    }

    public void inputTree(Tree t){
        if(t==null){
            return;
        }
        nodes[n]=new Node(t.info);
        Node p=nodes[n];
        if(t.left!=null){
            p.next=new Node(t.left.info);
            p=p.next;
        }
        if(t.right!=null){
            p.next=new Node(t.right.info);
            p=p.next;
        }
        n++;
        inputTree(t.left);
        inputTree(t.right);
    }

    public void printSonTree(){
        for(int i=0;i<n;i++){
            System.out.print(nodes[i].info);
            Node p=nodes[i];
            while(p.next!=null){
                p=p.next;
                System.out.print("\t"+p.info);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
