
class Solution
{
   static boolean fun(String A,ArrayList<String> B,int index){
        if(index==A.length())return true;
        String temp="";
        boolean a=false;
        for(int i=index;i<A.length();i++){
            temp+=A.charAt(i);
            if(B.contains(temp)==true){
                a = a|fun(A,B,i+1);
            }
        }
        return a;
    }
    public static int wordBreak(int n,String A, ArrayList<String> B )
    {
        //code here
        boolean ans = fun(A,B,0);
        return ans==true?1:0;
    }
}
