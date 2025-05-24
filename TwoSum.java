import java.util.HashMap;

public class TwoSum 
{
    public static int[] findTwoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i];
            if(map.containsKey(complement)) 
            {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        //no solution
        return new int[] {};
    }

   //main method
    public static void main(String[] args) 
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
