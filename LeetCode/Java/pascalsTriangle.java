class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        
        for(int i=1;i<numRows;i++) {
            int j=0;
            ans.add(new ArrayList<>());
            while(j<=i) {
                if(j==0 || j==i) ans.get(i).add(1);
                else ans.get(i).add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1)); 
                j++;
            }
        }
        
        return ans;
    }
}
