import java.util.Random;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        // Since kth largest element is the (n - k)th smallest element
        int targetIndex = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, targetIndex);
    }

    private static int quickSelect(int[] nums, int left, int right, int targetIndex) {
        if (left == right) {
            return nums[left];
        }

        Random random = new Random();
        int pivotIndex = left + random.nextInt(right - left + 1);
        pivotIndex = partition(nums, left, right, pivotIndex);

        if (targetIndex == pivotIndex) {
            return nums[targetIndex];
        } else if (targetIndex < pivotIndex) {
            return quickSelect(nums, left, pivotIndex - 1, targetIndex);
        } else {
            return quickSelect(nums, pivotIndex + 1, right, targetIndex);
        }
    }

    private static int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivotValue = nums[pivotIndex];
        int storeIndex = left;

        // Move pivot to end
        swap(nums, pivotIndex, right);

        for (int i = left; i <= right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, storeIndex);
                storeIndex++;
            }
        }

        // Move pivot to its final place
        swap(nums, storeIndex, right);

        return storeIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4}; // Example array
        int k = 2; // Value of k
        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
