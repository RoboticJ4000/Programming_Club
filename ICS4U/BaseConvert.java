public class BaseConvert {

  public static String valueToString(int value){
    String back = "ABCDEF";
    
    return value > 9 ? back.charAt(value-10) + "" : "" + value;
    
  }
  
  public static String decToBase(int value, int base){
    
    if(value < base){
     return valueToString(value); 
    }
    
    return valueToString(value/base) + decToBase(value % base, base);
    
  }
  
  public static void main(String[]args){
     
     System.out.println(decToBase(16,8));

   }


}
