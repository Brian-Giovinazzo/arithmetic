
public class Divide extends Binop {

	public Divide(Node l, Node r) {
		super(l, r);
	}
	
	public double eval() {
        return lChild.eval() / rChild.eval();
    }
	
	public String toString() {
		String str = "(" + lChild.toString() + " / " + rChild.toString() + ")";
		return str;
	}

}
