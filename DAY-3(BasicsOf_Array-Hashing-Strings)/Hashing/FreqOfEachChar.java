import java.util.*;

public class FreqOfEachChar {
    public static int[] charHashMap(char[] str) {
        int[] charHashArray = new int[26];

        for (char c : str) {
            charHashArray[c - 'a']++;
        }

        return charHashArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] str = { 'a', 'b', 'd', 'f', 'b', 'c', 'd', 'e', 'f', 'a' };

        int[] charHashArray = charHashMap(str);

        System.out.print("Enter char to find freqnency(a-f): ");
        char ch = sc.next().charAt(0);

        System.out.println("Frequency: " + charHashArray[ch - 'a']);

        sc.close();
    }

}
