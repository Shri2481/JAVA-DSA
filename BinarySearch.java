public class BinarySearch {

    public static int binarySearch(int nums[], int key) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (key == nums[midIndex]) {
                return midIndex;
            } else if (key < nums[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {10, 29, 32, 37, 75};
        int key = 32;

        int result = binarySearch(nums, key);

        if (result != -1) {
            System.out.println("The element is found at index: " + result);
        } else {
            System.out.println("Element not found!!!");
        }
    }
}
