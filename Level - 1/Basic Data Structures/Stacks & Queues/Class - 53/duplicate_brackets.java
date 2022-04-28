import java.util.Scanner;
import java.util.Stack;

public class duplicate_brackets {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ')')
                st.push(ch);

            else {

                if (st.peek() == '(') {

                    System.out.println("true");
                    System.exit(0);
                }

                else {

                    while (st.size() != 0 && st.peek() != '(')
                        st.pop();

                    st.pop();
                }
            }
        }

        System.out.println("false");
        scn.close();
    }

}