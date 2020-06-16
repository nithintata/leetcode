// Validate IP Address

class Solution {
    public String validIPAddress(String ip) {
       
        if (ip.isEmpty() || ip.charAt(ip.length() - 1) == '.' || ip.charAt(ip.length() - 1) == ':')
            return "Neither";
        if (ip.contains(".")) {
            String[] arr = ip.split("\\.");
            if (arr.length != 4)
                return "Neither";
            for (String s : arr) {
               
                if (s.isEmpty() || s.length() > 3 || hasLeadingZero(s) || !s.matches("[0-9]+") ||Integer.parseInt(s) > 255)
                    return "Neither";
                
            }
            return "IPv4";
        }
        
        String[] arr = ip.split(":");
        if (arr.length != 8)
            return "Neither";
        
        for (String s : arr) {
            if (s.isEmpty() || s.length() > 4 || !s.matches("[0-9a-fA-F]+"))
                return "Neither";
        }
        
        return "IPv6";
    }
    
    private boolean hasLeadingZero(String s) {
        int i = 0;
        char[] ch = s.toCharArray();
        if (ch[0] != '0' || (ch[0] == '0' && ch.length == 1))
            return false;
        return true;
    }
}
