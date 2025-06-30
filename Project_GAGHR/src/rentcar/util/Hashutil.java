package rentcar.util;

import java.security.MessageDigest;


public class Hashutil {
     public static String hashPassword(String password) {
        
        try {
            
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes("UTF-8"));
            
            StringBuilder hexString = new StringBuilder();
            
            for(byte b : hash) {
                
                hexString.append(String.format("%02x", b));
                
            }
            
            return hexString.toString();
            
        } catch (Exception e) {
            
            throw new RuntimeException(e);
            
        }
        
    }
}
