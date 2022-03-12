import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class infix_eval {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Character> operations = new Stack<>();
        Stack<Integer> operands = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(')
                operations.push(ch);

            else if (Character.isDigit(ch))
                operands.push(ch - '0');

            else if (ch == ')') {

                while (operations.size() != 0 && operations.peek() != '(') {

                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    char op = operations.pop();
                    operands.push(calc(v1, v2, op));

                }

                operations.pop();
            }

            else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {

                while (operations.size() != 0 && operations.peek() != '('
                        && precedence(ch) <= precedence(operations.peek())) {

                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    char op = operations.pop();
                    operands.push(calc(v1, v2, op));
                }

                operations.push(ch);
            }
        }

        while (operations.size() != 0) {

            int v2 = operands.pop();
            int v1 = operands.pop();
            char op = operations.pop();
            operands.push(calc(v1, v2, op));
        }

        System.out.println(operands.pop());
    }

    public static int calc(int v1, int v2, char op) {

        if (op == '+')
            return v1 + v2;

        else if (op == '-')
            return v1 - v2;

        else if (op == '/')
            return v1 / v2;

        else
            return v1 * v2;
    }

    public static int precedence(char ch) {

        if (ch == '+')
            return 1;

        else if (ch == '-')
            return 1;

        else if (ch == '/')
            return 2;

        else
            return 2;
    }

}
