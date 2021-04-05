public class IterateArray {
    public static void main(String[] args) {

        int[] nums = {10, 12, 45, 65, 43, 9, 92, 22, 34, 64, 2, 44}; // int array
        for (int i = 0; i < nums.length; i++)  { // for loop to iterate through array
            System.out.println(nums[i]); // Print out each element of the array

        }
        System.out.println(); // Prints a blank line

        int[] nums2 = {4,6,77,85,4,33,32,95,45,63,2 }; // int array

        // iterate through the array in reverse. J is less than the length of the array (-1) and
        // will start at the end of the array. As long as J is greater than or equal to 0 is will be true
        // and finally, j will de-increment on each iteration of the for loop through the array
        for (int j = nums2.length - 1; j >= 0; j--){
            System.out.println(nums2[j]); // Will print out each element of the array in reverse
        }

    }
}
