public class longestpalindromic {
    /**
     * Checks if a given substring of the string `s` is a palindrome.
     * 
     * @param s the input string
     * @param low the starting index of the substring
     * @param high the ending index of the substring
     * @return true if the substring is a palindrome, false otherwise
     */
        public static boolean checkPal(String s, int low, int high) {
            while (low < high) {
                if (s.charAt(low) != s.charAt(high))
                    return false;
                low++;
                high--;
            }
            return true;
        }
        /**
        * Finds and returns the longest palindromic substring in the input string.
         * 
        * @param s the input string
        * @return the longest palindromic substring
        */
    
    
        public static String longestPalindromic(String s) {
            int n = s.length();
            
            int maxLen = 1, start = 0;
    
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                  
                 
                    if (checkPal(s, i, j) && (j - i + 1) > maxLen) {
                        start = i;
                        maxLen = j - i + 1;
                    }
                }
            }
    
            return s.substring(start, start + maxLen);
        }
    
       
    /**
     * Main method to test the longestPalindromic function.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "christmas";
        System.out.println("Test Case 1 - Expected: christmas, Result: " + longestPalindromic(s1));

       
    }
}

