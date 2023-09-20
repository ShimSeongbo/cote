package leetcode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater sol = new ContainerWithMostWater();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(sol.maxArea(heights));  // Output should be 49
    }
}
