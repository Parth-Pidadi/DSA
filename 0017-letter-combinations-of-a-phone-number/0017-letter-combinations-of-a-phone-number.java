class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0) // Base case: If input is empty, return empty list
            return ans;
        
        String[] opt = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        phonePad(digits, ans, opt, 0, "");
        return ans;
    }
    
    void phonePad(String digits, List<String> ans, String[] opt, int index, String current) {
        if (index == digits.length()) {
            ans.add(current);
            return;
        }
        
        int digit = digits.charAt(index) - '0';
        String letters = opt[digit];
        for (int i = 0; i < letters.length(); i++) {
            phonePad(digits, ans, opt, index + 1, current + letters.charAt(i));
        }
    }
}