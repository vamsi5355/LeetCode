class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        StringBuilder sb = new StringBuilder();
        
        for (String part : parts) {
            int num = Integer.parseInt(part);       
            sb.append(Integer.toBinaryString(num)); 
            sb.append("-");                          
        }
        
        sb.setLength(sb.length() - 1);
        
        return sb.toString();
    }
}
