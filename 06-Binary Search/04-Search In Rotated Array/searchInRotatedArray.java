//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class searchInRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,1,2,3},3));
    }
    public  static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[start]<=nums[mid])
            {
                if(nums[mid]>=target && target>=nums[start])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(nums[mid]<=target && nums[end]>=target)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
