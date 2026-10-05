class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count()<nums.length;
    }
    public boolean hasDuplicate2(int[] nums) {
       Set<Integer> seen = new HashSet<>();
       for(int num : nums){
        if(seen.contains(num)){
            return true;
        }
        seen.add(num);
       }
       return false;
    }
}


    
