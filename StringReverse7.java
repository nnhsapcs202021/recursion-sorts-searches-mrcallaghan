
/**
 * Write a description of class StringReverse7 here.
 *
 * @author mrcallaghan
 * @version 21apr2021
 */
public class StringReverse7
{
   public static String reverse(String str)
   {
       // must have a terminating case
       if(str.equals(""))
       {
           return str;
        }
       
       // must make the problem simpler
       String firstChar = str.substring(0,1);
       String restOfString = str.substring(1);
       
       // recurse - call this method with the simipler problem
       String restOfStringReversed = reverse(restOfString);
       
       String strReversed = restOfStringReversed + firstChar;
       return strReversed;
    
    }
    
    
   public static String reverseIter(String str)
   {
       String strReversed = "";
       
       for(int i = 0; i < str.length(); i++)
       {
        strReversed = str.substring(i, i + 1) + strReversed;
           
        }
       
       return strReversed;
    
    }
}
