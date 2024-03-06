
class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        int index =0;
        ArrayList<Integer> list = new ArrayList<>();
       while (index < text.length()) {
            int a = text.indexOf(pattern, index);
            
            if (a >= 0) {
                list.add(a + 1); 
                index = a + 1; 
            } else {
                break; 
            }
        }
        return list;
    }
}
