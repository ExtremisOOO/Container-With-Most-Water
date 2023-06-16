class Solution {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area;
        int output = Integer.MIN_VALUE;
        while(left<right){
            area = (right-left)*Math.min(height[left],height[right]);
            if(output<area) output = area;
            if(height[left]>=height[right])
                right--;
            else
                left++;
        }
        return output;
    } 
}