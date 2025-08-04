package JavaInterviewPackage;



public class NonRepeatingChacter {




    private static Character firstNonRepeatingCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        int[] charCount = new int[256]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        System.out.println("Character count array: "+java.util.Arrays.toString(charCount));
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }
        return null; // No non-repeating character found
    }
    public static void main(String[] args) {
        Character swiss = firstNonRepeatingCharacter("swiss");
        System.out.println("First non-repeating character in \"swiss\": " + swiss);
    }
}
