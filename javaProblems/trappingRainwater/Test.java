import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution s = new Solution();

        // Test case 1: Example test case
        int[] input1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected1 = 6;
        int result1 = s.trap(input1);
        if (expected1 != result1) {
            logger.log(Level.SEVERE, "Test case 1 failed!");
            System.exit(1);
            throw new Exception("Test case 1 failed!");
        }

        // Test case 2: Add more test cases here
        int[] input2 = {4, 2, 0, 3, 2, 5};
        int expected2 = 9;
        int result2 = s.trap(input2);
        if (expected2 != result2) {
            logger.log(Level.SEVERE, "Test case 2 failed!");
            System.exit(1);
            throw new Exception("Test case 2 failed!");
        }

        // All test cases passed
        System.out.print("All test cases passed!");
    }
}
