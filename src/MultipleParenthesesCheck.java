import java.util.*;
public class MultipleParenthesesCheck {
    public boolean checkParens(String parens) {
        Stack <Character> stack = new Stack<Character>();
        char[] chars = parens.toCharArray();
        for( int i = 0; i < chars.length; i++ ){
            if(chars[i] == '('  || chars[i] == '{' || chars[i] == '[' ){
                stack.push(chars[i]);
            }
            else if(chars[i] == ')' || chars[i] =='}' || chars[i] == ']') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(' && chars[i] == ')' ) {
                        stack.pop();
                    }
                    else if (stack.peek() == '{' && chars[i] == '}'){
                        stack.pop();
                    }
                    else if (stack.peek() == '[' && chars[i] == ']') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            else {
                return false;
                }
            }
        if (stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String[]args){
    MultipleParenthesesCheck check = new MultipleParenthesesCheck();
    String parentheses = "{([)}";
    System.out.println(check.checkParens(parentheses));
    }
}
