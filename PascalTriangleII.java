import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
		if(rowIndex<0) return null;
		list.add(1);
		for(int i=1;i<=rowIndex;i++) {
			List<Integer> current = new ArrayList<>(i+1);
			for (int j = 0; j <= i; j++) {
				current.add(0);
            }
			current.set(0, 1);
			current.set(i, list.get(i-1));
			for(int j=1;j<i;j++) {
				current.set(j, list.get(j)+list.get(j-1));
			}
			list=current;
		}
		
		return list;
        
    }
}
