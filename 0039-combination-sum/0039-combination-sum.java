class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return dfs(target, candidates, 0, new ArrayList<>(), 0);
        
        
    }
    public List<List<Integer>> dfs(int target, int[] candidates, int i, ArrayList<Integer> current, int total){
        if(total == target){
            List<List<Integer>> res = new ArrayList<>();

            res.add((ArrayList<Integer>)current.clone());
            return res;
                
            
        }
        if(i >= candidates.length || total > target){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();

        current.add(candidates[i]);
        list.addAll(dfs(target, candidates, i, current, total+candidates[i]));
        current.remove(current.size()-1);
        list.addAll(dfs(target, candidates, i+1, current, total));
        return list;
        
        
        
        
    }
    
}

