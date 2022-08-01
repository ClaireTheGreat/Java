import java.util.*;

public class TwoSum<target> {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] answers = twoSum(nums, target);
        int[] expected = new int[]{0,1};
        Verify(answers, expected);

        int[] nums2 = new int[]{3,2,4};
        int target2 = 6;
        int[] answers2 = twoSum(nums2, target2);
        int[] expected2 = new int[]{1,2};
        Verify(answers2, expected2);

        System.out.println("Done");
    }

    public static int[] twoSum (int[] nums, int target) {
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int left = nums[i];

            int right = target - left;
            for (int k = i+1; k < nums.length; k++) {
                if (nums[k] == right) {
                    answers.add(i);
                    answers.add(k);
                    break;
                }
            }
        }

        // convert int list to int array
        int[] output = new int[answers.size()];
        for (int i = 0; i < answers.size(); i++) {
            output[i] = answers.get(i);
        }

        return output;
    }

    private static void Verify(int[] actual, int[] expected) throws Exception {
        if (actual.length == expected.length) {
            for (int i = 0; i < actual.length; i++) {
                if (actual[i] != expected[i]) {
                    String error = String.format("Value of position %d doesn't agree, expecting %d, got %d", i, expected[i], actual[i]);
                    throw new Exception(error);
                }
            }
        }
        else {
            String error = String.format("Length doesn't agree, expecting %d, got %d", expected.length, actual.length);
            throw new Exception(error);
        }
    }

}



