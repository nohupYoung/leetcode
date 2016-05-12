public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(numRows==0) return list;
		ArrayList<Integer> first=new ArrayList<>();
		first.add(1);
		list.add(first);
		for(int i=1;i<numRows;i++) {
			ArrayList<Integer> current = new ArrayList<>();
			current.add(1);
			List<Integer> previous=list.get(i-1);
			for(int j=1;j<i;j++) {
				current.add(previous.get(j-1)+previous.get(j));
			}
			current.add(1);
			list.add(current);
			
		}
		
        return list;
    }


}