package chatgpt;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {


    public static void main1(String[] args) {
        Integer[] nums1 = {1, 2, 2, 1};
        Integer[] nums2 = {2, 2};

        Set<Integer> s1 = new HashSet<>(Arrays.asList(nums1));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(nums2));

        s1.retainAll(s2);

        System.out.println(s1);
    }

    public static void main2(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Set<Integer> s1 = new HashSet<>();
        for (int num : nums1) {
            s1.add(num);
        }

        Set<Integer> s2 = new HashSet<>();
        for (int num : nums2) {
            s2.add(num);
        }

        s1.retainAll(s2);

        System.out.println(s1);
    }

    public static void main3(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(findCommonElements(nums1, nums2));
    }

    public static void main4(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

        set1.retainAll(set2);

        System.out.println("set1 = " + set1);
    }

    public static Set<Integer> findCommonElements(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return Collections.emptySet();
        }

        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        return set1;
    }
}
