class Solution
{
    //aux method
     public void aux(List<String> list,String s,String ans,int i){
        if(i == s.length()){
            list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        aux(list,s,ans+ch,i+1);
        aux(list,s,ans,i+1);
    }
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> list = new ArrayList<>();
        aux(list,s,"",0);
        Collections.sort(list);
        list.remove("");
        return list;
    }
}
