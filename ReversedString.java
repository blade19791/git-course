public class ReversedString {
    public static void main(String[] args) {
        String original = "hello";
        char[] chars = original.toCharArray(); // Step 1

        int left = 0, right = chars.length - 1;
        while (left < right) {
            // Step 2: Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        // Step 3: Convert back to String
        String reversed = new String(chars);
        System.out.println("Reversed String: " + reversed);
    }
}
