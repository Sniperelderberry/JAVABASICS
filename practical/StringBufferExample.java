public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specified index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Delete characters between specified indices
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Replace characters between specified indices with a new string
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Reverse the character sequence
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

