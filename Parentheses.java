import java.util.Stack;

public class Parentheses{
	private static final char L_PAREN    = '(';
	private static final char R_PAREN    = ')';
	private static final char L_BRACKET  = '[';
	private static final char R_BRACKET  = ']';

	public static boolean isBalanced(String str) {
		if(str ==null || str.equals(""))return true;
	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == L_PAREN)   stack.push(L_PAREN);
	        else if (str.charAt(i) == L_BRACKET) stack.push(L_BRACKET);
	        else if (str.charAt(i) == R_PAREN) {
	            if (stack.isEmpty())  return false;
	            if (stack.pop() != L_PAREN) return false;
	        }else if (str.charAt(i) == R_BRACKET) {
	            if (stack.isEmpty())        return false;
	            if (stack.pop() != L_BRACKET) return false;
	        }
	    }
	    return stack.isEmpty();
	}


	public static void main(String[] args) {
		System.out.println(isBalanced("[()]"));
		System.out.println(isBalanced("(()[])"));
		System.out.println(isBalanced("([)]"));
	}
}