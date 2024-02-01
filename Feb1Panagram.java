class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        if(s.length()<26){//if length is less than 26 then it won't be panagram
            return false;// to maintain order of time complexity
        }
        String alpha="abcdefghijklmnopqrstuvwxyz";
        s=s.toLowerCase();// for less comparisons ,leaving the caps ones
        for(int i=0;i<26;i++){//will match a to z characters from alpha
            if(s.contains(""+alpha.charAt(i))==false) 
              return false;// terminate
        }
        return true;
    }
}
