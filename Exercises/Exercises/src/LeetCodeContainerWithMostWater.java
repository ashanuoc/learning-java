public class LeetCodeContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
//        Brute force
        int maxArea = 0;
        int w, l, currentArea;
        int line1 =0, line2 = 0;

        for (int i = 0; i <= height.length; i++){
            for (int j = i + 1; j < height.length; j++){
                w = j - i;
                l = Math.min(height[i], height[j]);
                currentArea = w * l;
                if (currentArea > maxArea){
                    maxArea = currentArea;
                    line1 = i;
                    line2 = j;
                }
            }
        }
        System.out.println("Max area = " + maxArea);
        System.out.println("Container = line1: " + line1 + " and line2: " + line2);
    }
}
