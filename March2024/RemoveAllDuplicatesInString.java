class Soluton{
  public char nthCharacter(String s, int r, int n)
    {
        //code here
        while(r-->0){
            StringBuilder str=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    str.append("01");
                }
                if(s.charAt(i)=='1'){
                    str.append("10");
                }
                if(str.length()>n)
                    break;
            }
            s=str.toString();
            str.setLength(0);
        }
        // System.out.print(s);
        return s.charAt(n);
    }
  }
}
