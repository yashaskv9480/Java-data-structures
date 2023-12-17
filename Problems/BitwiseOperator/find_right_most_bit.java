
package Problems.BitwiseOperator;

public class find_right_most_bit {
    public static void main(String[] args) {
        int number = 10; // Replace this with your desired integer
        int position = findRightmostSetBitPosition(number);
        System.out.println("Position of the rightmost set bit: " + position);
    }
    //HEllo

    private static int findRightmostSetBitPosition(int n) {
        if (n == 0) {
            return -1; // No set bit found
        }

        int position = 1;

        // Keep shifting number to the right until the rightmost set bit is 1
        while ((n & 1) == 0) {
            n >>= 1;
            position++;
        }

        return position;
    }
}

