public class Sep11{
    public static void main(String[] args) {
        String input = "resource";
        System.out.println("The given string is: " + input);
        findDuplicates(input);
        System.out.println("ID : 23DCS078_KRISH PATEL");
    }

    public static void findDuplicates(String str) {
        int[] charCount = new int[256]; // ASCII character set size

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        System.out.println("The duplicate characters and counts are:");

        // Print the characters that appear more than once
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " appears " + charCount[i] + " times");
                
            }
        }
    }
}
