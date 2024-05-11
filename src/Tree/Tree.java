package Tree;

public class Tree {

    char info;
    Tree left;
    Tree right;

    public Tree(char info){
        this.info=info;
        left=null;
        right=null;
    }

    public void addLeft(Tree t){
        if(this.left==null){
            this.left=t;
        }else{
            System.out.println("left exist！！");
        }
    }

    public void addRight(Tree t){
        if(this.right==null){
            this.right=t;
        }else{
            System.out.println("right exist！！");
        }
    }

    public void forwardTravel(){
            System.out.print(this.info+" ");
            if(this.left!=null){
                this.left.forwardTravel();
            }
            if(this.right!=null){
                this.right.forwardTravel();
            }
    }

    public void midTravel(){
        if(this.left!=null){
            this.left.midTravel();
        }
        System.out.print(this.info+" ");
        if(this.right!=null){
            this.right.midTravel();
        }
    }

    public void lastTravel(){
        if(this.left!=null){
            this.left.midTravel();
        }
        if(this.right!=null){
            this.right.midTravel();
        }
        System.out.print(this.info+" ");
    }

    public void lfExchange(){
        if(this.right==null&&this.left==null){
            return;
        }
        if(this.left!=null&&this.right!=null){
            Tree t=new Tree('T');
            t=this.left;
            this.left=this.right;
            this.right=t;
        }else if(this.left==null&&this.right!=null){
            this.left=this.right;
            this.right=null;
        }else{
            this.right=this.left;
            this.left=null;
        }
        this.left.lfExchange();
        this.right.lfExchange();
    }

    public boolean isFes(){
        if(this.left==null&&this.right==null){
            return true;
        }
        int sumofson=0;
        if(this.right!=null){
            sumofson=this.right.info+sumofson;
        }
        if(this.left!=null){
            sumofson=this.left.info+sumofson;
        }
        if(this.info!=sumofson){
            return false;
        }
        return this.left.isFes()&&this.right.isFes();
    }

    public static void main(String[] args) {
        //question 1
        Tree t=new Tree('A');
        t.addLeft(new Tree('B'));
        t.addRight(new Tree('C'));
        t.left.addLeft(new Tree('D'));
        t.left.addRight(new Tree('E'));
        System.out.print("the result of root left right:");
        t.forwardTravel();
        System.out.println();
        System.out.print("the result of left root right:");
        t.midTravel();
        System.out.println();
        System.out.print("this result of left right root:");
        t.lastTravel();
        System.out.println("\n");
        //question 4 sontree
        System.out.println("info"+" "+"son");
        SonTree ST=new SonTree(10);
        ST.inputTree(t);
        ST.printSonTree();
        //question 3
        t.lfExchange();
        System.out.println();
        System.out.print("the exchanged result of root left right:");
        t.forwardTravel();
        System.out.println();
        System.out.print("the exchanged result of left root right:");
        t.midTravel();
        System.out.println();
        System.out.print("this exchanged result of left right root:");
        t.lastTravel();
        //question 2
        System.out.println("\n"+t.isFes());
        //question 4
        System.out.println();
        System.out.println("Son and Brother Tree");
        Tree t1=new Tree('A');
        t1.addLeft(new Tree('B'));
        t1.left.addLeft(new Tree('D'));
        t1.left.left.addRight(new Tree('E'));
        t1.left.left.right.addLeft(new Tree('H'));
        t1.left.left.right.left.addRight(new Tree('I'));
        t1.left.left.right.left.right.addRight(new Tree('J'));
        t1.left.addRight(new Tree('C'));
        t1.left.right.addLeft(new Tree('F'));
        t1.left.right.left.addRight(new Tree('G'));
        t1.forwardTravel();
    }
}
