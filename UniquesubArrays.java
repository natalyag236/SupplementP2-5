import java.util.HashSet;
import java.util.Set;

public class UniquesubArrays {
    /**
     * This method counts the number of unique subarrays in the given array that sum up to the target value.
     * It uses a HashSet to store subarrays as strings, ensuring only unique subarrays are counted.
     *
     * @param arr The input array of integers
     * @param target The target sum for the subarrays
     * @return The number of unique subarrays that sum to the target
     */
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
