class Solution {
    public List<String> letterCombinations(String digits) {
        // ArrayList<String> ans = new ArrayList<>();
        String ans = "";
        
        ArrayList<String> opt = new ArrayList<>();
        Collections.addAll(opt, ""," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" );
        if(digits.length() == 0){
            return new ArrayList<>() ;
        }
      
        
        
        
        return phonePad(digits, ans, opt);
        
    }
    ArrayList<String> phonePad(String digits, String ans, ArrayList<String> opt){
        if(digits.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int ch = digits.charAt(0) - '0';
        String alpha = opt.get(ch);
        for(int i=0; i<alpha.length();i++){
            char dh = alpha.charAt(i);
            list.addAll(phonePad(digits.substring(1), ans + dh, opt));
            
        }
        return list;
    }
    
}