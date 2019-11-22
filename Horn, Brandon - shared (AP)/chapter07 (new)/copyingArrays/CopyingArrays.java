package copyingArrays;

import forEachLoops.Coordinate2D;

public class CopyingArrays
{
    public static void main(String[] args)
    {
        int[] nums = {5, 4, 3, 2};
        
        int[] nums2 = nums;
        nums2[0] = -7;
        System.out.println(nums[0]);
        
        
        int[] nums3 = nums.clone();
        nums3[1] = -8;
        System.out.println(nums[1]);
        
        
        int[] nums4 = new int[nums.length];
        System.arraycopy(nums, 0, nums4, 0, nums.length);
        nums4[2] = -11;
        System.out.println(nums[2]);
        
        
        Coordinate2D[] coors = new Coordinate2D[3];
        coors[0] = new Coordinate2D(0, 0);
        coors[1] = new Coordinate2D(1, 1);
        coors[2] = new Coordinate2D(2, 2);
        
        Coordinate2D[] coors2 = coors.clone();
        coors2[0] = new Coordinate2D(-5, -5);
        coors2[1].setX(-10);
        coors2[1].setY(-10);
        
        System.out.println(coors[0]);
        System.out.println(coors[1]);
    }
}
