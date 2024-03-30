class Reverse {
    public static void reverseArray(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
     //  int[] nums = {2, 3, 5, 4, 1};
      int [] nums = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
