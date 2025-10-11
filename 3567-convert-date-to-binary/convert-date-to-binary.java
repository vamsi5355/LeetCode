class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
            String sb="";        
        for (String part : parts) {
            int num = Integer.parseInt(part);       
            sb+=(Integer.toBinaryString(num)); 
            sb+=("-");                          
        }
        
        
        return sb.substring(0,sb.length()-1);
    }
}
