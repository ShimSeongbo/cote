package chatgpt;


import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {
    public static void main1(String[] args) {
        // 예제 입력
        int[] nums = {1, 2, -3, 4, 5};

        // 여기서부터 코드를 작성하세요
        System.out.println(hasZeroSumSubarray1(nums));
    }

    public static boolean hasZeroSumSubarray1(int[] array) {
        if (array.length <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < array.length - 1; i++) {

            sum = array[i];

            for (int j = i + 1; j < array.length; j++) {

                if ((sum += array[j]) == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, -3, 4, 5};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {0};
        int[] nums4 = {-1, 1};
        int[] nums5 = {};

        System.out.println(hasZeroSumSubarray(nums1)); // true
        System.out.println(hasZeroSumSubarray(nums2)); // false
        System.out.println(hasZeroSumSubarray(nums3)); // true
        System.out.println(hasZeroSumSubarray(nums4)); // true
        System.out.println(hasZeroSumSubarray(nums5)); // false
    }


    public static boolean hasZeroSumSubarray(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        Set<Integer> prefixSums = new HashSet<>();
        int sum = 0;

        prefixSums.add(0);

        for (int num : array) {
            sum += num;

            if (prefixSums.contains(sum)) {
                return true;
            }

            prefixSums.add(sum);
        }

        return false;
    }
}
