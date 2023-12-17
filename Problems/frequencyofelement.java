package Problems;

public class frequencyofelement {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 4};
        int n = nums.length;
        
        // Calculate and display the frequency array
        int[] result = frequency(n, nums);
        System.out.print("Frequency array: ");
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] frequency(int n, int[] nums) {
        int[] frequencyArray = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            frequencyArray[i] = count;
        }

        return frequencyArray;
    }
}
