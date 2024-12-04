public class LeetCodeContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int lp = 0, rp = height.length-1, maxWater = 0;
        int w, l, currentWater;

        while(lp < rp){
            w = rp - lp;
            l = Math.min(height[lp], height[rp]);
            currentWater = l * w;

            if (currentWater > maxWater){
                maxWater = currentWater;
            }

            if (height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        System.out.println("Max water= " + maxWater);


//        Brute force
        /*int maxArea = 0;
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
        System.out.println("Container = line1: " + line1 + " and line2: " + line2);*/
    }
}
