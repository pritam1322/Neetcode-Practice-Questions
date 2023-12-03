class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<String>();
        backtrack(s,"",0,0,n);
        return s;
    }

    public void backtrack(List<String>s, String res, int op, int cl, int mx){
        if(res.length() == mx*2){
            s.add(res);
        }

        if(op<mx){
            backtrack(s,res+'(',op+1,cl,mx);
        }
        if(cl<op){
            backtrack(s,res+')',op,cl+1,mx);
        }
    }
}
