import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class infix_conersion {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(')
                op.push(ch);

            else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                pre.push(ch + "");
                post.push(ch + "");
            }

            else if (ch == ')') {

                while (op.size() != 0 && op.peek() != '(') {

                    char c = op.pop();
                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    pre.push(c + prev1 + prev2);

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    post.push(postv1 + postv2 + c);
                }

                op.pop();
            }

            else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {

                while (op.size() != 0 && op.peek() != '(' && precedence(ch) <= precedence(op.peek())) {

                    char c = op.pop();
                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    pre.push(c + prev1 + prev2);

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    post.push(postv1 + postv2 + c);
                }

                op.push(ch);
            }
        }

        while (op.size() != 0) {

            char c = op.pop();
            String prev2 = pre.pop();
            String prev1 = pre.pop();
            pre.push(c + prev1 + prev2);

            String postv2 = post.pop();
            String postv1 = post.pop();
            post.push(postv1 + postv2 + c);
        }

        System.out.println(post.pop());
        System.out.println(pre.pop());

        br.close();

    }

    public static int precedence(char op) {

        if (op == '+' || op == '-')
            return 1;

        else
            return 2;
    }
}