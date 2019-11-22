package arraysAsObjects;

public class ArraysAsObjects
{
    public static void main(String[] args)
    {
        int[] nums = new int[3];
        
        System.out.println(nums[0]);
        mystery1(nums);
        System.out.println(nums[0]);
        
        System.out.println(nums[1]);
        mystery2(nums[1]);
        System.out.println(nums[1]);
    }
    
    public static void mystery1(int[] arr)
    {
        arr[0] = 5;
    }
    
    public static void mystery2(int val)
    {
        val = 3;
    }
}
