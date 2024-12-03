public class longestpalindromic {
        public static boolean checkPal(String s, int low, int high) {
            while (low < high) {
                if (s.charAt(low) != s.charAt(high))
                    return false;
                low++;
                high--;
            }
            return true;
        }
    
    
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
    
       
    
    public static void main(String[] args) {
        String s1 = "christmas";
        System.out.println("Test Case 1 - Expected: christmas, Result: " + longestPalindromic(s1));

       
    }
}

