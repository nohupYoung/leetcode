import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1==null || nums2==null) {
			return null;
		}
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums1.length;i++) {
			if(!set.contains(nums1[i])) {
				set.add(nums1[i]);
			}			
		}
		List<Integer> list=new ArrayList<>();
		for(int j=0;j<nums2.length;j++) {
			if(set.contains(nums2[j])) {
				list.add(nums2[j]);
				set.remove(nums2[j]);
			}
		}
        int res[]=new int[list.size()];
        for(int i=0;i<res.length;i++) {
        	res[i]=list.get(i);
        }
        return res;
    }

}
