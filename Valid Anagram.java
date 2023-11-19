class Solution {
    public boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        if(s_len != t_len) return false;
        HashMap<Character,Integer> mapS = new HashMap<Character,Integer>();

        for(int i=0; i<s_len; i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0)+1);
            mapS.put(t.charAt(i),mapS.getOrDefault(t.charAt(i),0)-1);
        }
        for(char c:mapS.keySet()){
            if(mapS.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}
