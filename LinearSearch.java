public class LinearSearch {
/* 
 * Linear Search : Search linearly were it start from the 
 *  start index and ends up with the last index of any array.
 * 
 *  Time Complexity : O(n)
 * 
 *  Time Complexity proportional to loops.
 *     
*/


    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (key == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 20, 10, 50, 100};
        int key = 200;


        int result = linearSearch(nums, key);

        if (result != -1) {
            System.out.println("The Element found at Index " + result);
        } else {
            System.out.println("Element Not Found!!!");
        }
    }
}
