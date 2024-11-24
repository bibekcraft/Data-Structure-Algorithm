import java.util.Stack;

public class InfixToPostfix {

    // Method to determine operator precedence
    int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1; // For non-operators
        };
    }

    // Method to convert infix expression to postfix
    String convertToPostfix(String exp) {
        StringBuilder res = new StringBuilder(); // Use StringBuilder for efficient concatenation
        Stack<Character> stk = new Stack<>();   // Use Java's Stack class

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                // If the character is an operand, add it to the result
                res.append(ch);
            } else if (ch == '(') {
                // Push '(' onto the stack
                stk.push(ch);
            } else if (ch == ')') {
                // Pop from stack until '(' is encountered
                while (!stk.isEmpty() && stk.peek() != '(') {
                    res.append(stk.pop());
                }
                if (!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop(); // Pop '('
                }
            } else {
                // Operator case
                while (!stk.isEmpty() && precedence(stk.peek()) >= precedence(ch)) {
                    res.append(stk.pop());
                }
                stk.push(ch);
        }

        // Pop all remaining operators from the stack
        while (!stk.isEmpty()) {
            res.append(stk.pop());
        }

        return res.toString();
}

    public static void main(String[] args) {
        InfixToPostfix converter = new InfixToPostfix();
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix: " + converter.convertToPostfix(infix));
    }
}
