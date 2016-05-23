import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();  
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
  
        for (int i = 0; i < nums1.length; i++)  
        {  
            if (map.containsKey(nums1[i]))  
            {  
                map.put(nums1[i], map.get(nums1[i]) + 1);  
            }  
            else  
            {  
                map.put(nums1[i], 1);  
            }  
        }  
  
        for (int i = 0; i < nums2.length; i++)  
        {  
            if (map.containsKey(nums2[i]))  
            {  
                list.add(nums2[i]);  
                map.put(nums2[i], map.get(nums2[i]) - 1);  
  
                if (0 == map.get(nums2[i]))  
                {  
                    map.remove(nums2[i]);  
                }  
            }  
        }  
  
        int[] ans = new int[list.size()];  
        for (int i = 0; i < list.size(); i++)  
        {  
            ans[i] = list.get(i);  
        }  
  
        return ans;  
    }

}
