/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Submission by:
 * Date:
 * Purpose: Test the Plus Binop
 */
import java.util.*;

public class TestArithmetic {
	
    public static void main(String[] args) {
        
    	randomArithmetic();
    	randomArithmetic();
    	randomArithmetic();
    	randomArithmetic();
    	randomArithmetic();	
    }
    
    public static void randomArithmetic() {
    	Const one, two, three, four;
    	Binop first, second, third;
    	one = randConst();
    	two = randConst();
    	three = randConst();
    	four = randConst();
    	first = randOperator(one, two);
    	second = randOperator(three, four);
    	third = randOperator(first, second);
    	
    	System.out.println(third.toString() + " = " + third.eval());   	
    }
    
    public static Const randConst() {
    	Random randCon = new Random();
    	int constant = randCon.nextInt(20) + 1;
    	return new Const((double)constant);
    }
    
    public static Binop randOperator(Node a, Node b) {
    	Random randOp = new Random();
    	int op = randOp.nextInt(4);
    	
    	if (op == 0) {
    		return new Plus(a, b);
    	} else if (op == 1) {
    		return new Minus(a, b);
    	} else if ( op == 2) {
    		return new Divide(a, b);
    	} else {
    		return new Mult(a, b);
    	}
    }
    
}