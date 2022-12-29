
public class Minus extends Binop {

	public Minus(Node l, Node r) {
		super(l, r);
	}
	
	public double eval() {
        return lChild.eval() - rChild.eval();
    }

	public String toString() {
		String str = "(" + lChild.toString() + " - " + rChild.toString() + ")";
		return str;
	}
}
