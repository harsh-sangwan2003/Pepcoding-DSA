import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class infix_eval {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Character> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(')
                s1.push(ch);

            else if (Character.isDigit(ch))
                s2.push(ch - '0');

            else if (ch == ')') {

                while (s1.size() != 0 && s1.peek() != '(') {

                    int v2 = s2.pop();
                    int v1 = s2.pop();
                    char op = s1.pop();
                    s2.push(calc(v1, v2, op));
                }

                s1.pop();
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while (s1.size() != 0 && s1.peek() != '(' && precedence(ch) <= precedence(s1.peek())) {

                    int v2 = s2.pop();
                    int v1 = s2.pop();
                    char op = s1.pop();
                    s2.push(calc(v1, v2, op));
                }

                s1.push(ch);
            }
        }

        while (s1.size() != 0) {

            int v2 = s2.pop();
            int v1 = s2.pop();
            char op = s1.pop();
            s2.push(calc(v1, v2, op));
        }

        System.out.println(s2.pop());

        br.close();
    }

    public static int precedence(char ch) {

        if (ch == '+' || ch == '-')
            return 1;

        else
            return 2;
    }

    public static int calc(int v1, int v2, char ch) {

        if (ch == '+')
            return v1 + v2;

        else if (ch == '-')
            return v1 - v2;

        else if (ch == '*')
            return v1 * v2;

        else
            return v1 / v2;
    }

}