
// Anagrams are actually permutations of a string. 
// So basic idea is to get a string and sort it as all anagram will give a same sorted srtring. 
// Using this sorted string as entry in a hashmap, we'll store all the strings in a list having a key equal to sorted string.

Then we'll iterate over array and store final answer in a list.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        
        for(String s : strs) {
            char[] split = s.toCharArray();
            Arrays.sort(split);
            String str = new String(split);
            
            if(!map.containsKey(str)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(str,list);
            } else {
                List<String> temp = map.get(str);
                temp.add(s);
                map.put(str,temp);
            }
        }
        

        for(Map.Entry<String,List<String>> m:map.entrySet() ) {
            ans.add(m.getValue());
        }
        return ans;
    }
}
