
package javafiles;

import java.util.StringTokenizer;

/**
 *
 * @author 20109
 */
public class Verifier {
    /**
     * 
     * @param email string
     * @return true if and only if user has entered a valid email address
     */
    
    public boolean emailVerify(String email){
        // divide the email at @ sign
        
        if(!email.contains("@"))
            return false;
        StringTokenizer st = new StringTokenizer(email, "@");
        
        //check if there is no word before the @ sign
        if(st.countTokens()!= 2)
            return false;
        String beforeSign = st.nextToken();
           
        if(beforeSign.length() < 1)
            return false;
        if(beforeSign.contains(" "))
            return false;
           
        String afterSign = st.nextToken();

        if(!afterSign.contains("."))
            return false;
        
        StringTokenizer st2 = new StringTokenizer(afterSign, ".");
        
        //check if there is more or less words than 2
        if(st2.countTokens()!= 2)
            return false;
        while(st2.hasMoreTokens())
            if(st2.nextToken().length()< 1)
                return false;
        
        return true;          
    }
    /**
     * 
     * @param password String
     * @return true if and only if the password's length is at least 6 and contains at least one uppercase char and one lower case char
     */
    public boolean passwordVerify(String password){
        boolean upperCase = false, lowerCase  = false, digit = false;
        
        if(password.length() < 6)
            return false;
        
        for(int i =0; i< password.length(); i++){
            if(Character.isUpperCase(password.charAt(i)))
                upperCase = true;
            else if(Character.isLowerCase(password.charAt(i)))
                lowerCase = true;
            else 
                digit = true;
        }
        return (digit && lowerCase && upperCase);
    }  
    /**
     * 
     * @param id String 
     *
     * @return true if and only if the ID is 14 Digit only
     */
    public boolean idVerify(String id)
    {
        boolean notInt = false, isSize = false;

        if(id.length()== 14)
        {
            isSize=true;
            for (int i=0;i<id.length();i++)
            {
                if(!Character.isDigit(id.charAt(i)))
                    notInt=true;
            }
        }
        return (notInt == false && isSize == true);
    }
}
