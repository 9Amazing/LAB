package lab9;



import rmuti.ds.Node;
import rmuti.ds.TreeDraw;


public class tree {
    public static void main(String[] args) {
       Node c = new Node("c",null,null);
       Node d = new Node("d",null,null);
       Node b = new Node("b",c,d);
       Node e = new Node("e",null,null);
       Node a = new Node("a",b,e);

       TreeDraw treeDraw = new TreeDraw(a);
       treeDraw.binaryTreeDraw();

    }
}
