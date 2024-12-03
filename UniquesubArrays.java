import java.util.HashSet;
import java.util.Set;

public class UniquesubArrays {
    public static int  countUniquesubArrays(int[] arr, int target) {
         Set<String> uniqueSubarrays = new HashSet<>();
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            StringBuilder subarray = new StringBuilder();

            for (int end = start; end < n; end++) {
                sum += arr[end];
                subarray.append(arr[end]).append(",");
                
                if (sum == target) {
                    uniqueSubarrays.add(subarray.toString());
                }
            }
        }
        
        return uniqueSubarrays.size();
    }
    
    public static void main(String[] args) {
        int[] arr1 = {4, 1, 2, 7, 3};
        int target1 = 6;
        System.out.println("Test Case 1 - Expected: 2, Result: " + countUniquesubArrays(arr1, target1));
    }   
}
