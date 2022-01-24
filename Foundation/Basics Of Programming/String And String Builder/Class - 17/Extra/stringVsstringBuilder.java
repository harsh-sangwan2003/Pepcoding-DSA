package Extra;

public class stringVsstringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(ch);

        // Setting a character
        sb.setCharAt(0, 'd');
        System.out.println(sb);

        // Inserting a character
        sb.insert(2, 'y');
        System.out.println(sb);

        // Deleting a character
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);

        // To add at last
        sb.append("pp");
        System.out.println(sb);

        // Length
        System.out.println(sb.length());
    }
}
