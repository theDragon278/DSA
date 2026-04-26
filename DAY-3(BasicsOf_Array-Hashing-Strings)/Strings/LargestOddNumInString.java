public class LargestOddNumInString {
    public static String largestOddNum(String s) {
        int end = s.length() - 1;

        while (end >= 0) {
            int digit = s.charAt(end) - '0';
            if (digit % 2 != 0) {
                String resultString = s.substring(0, end + 1);

                int i = 0;
                while (i < resultString.length() && resultString.charAt(i) == '0') {
                    i++;
                }

                return resultString.substring(i);
            }
            end--;
        }

        return "";
    }

    public static void main(String[] args) {
        String str = "0005";
        System.out.println("largest odd number in the string is " + largestOddNum(str));
    }

}
