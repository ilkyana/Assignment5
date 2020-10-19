package Practice.Assignment5;

public class Question1 {
    public static void main(String[] arg){
        String str = "ababbaba";
        Palindrom(str);

    }
    public static void Palindrom(String str){
        if(str.isEmpty() || str.length()<=1){
            System.out.println("CanNot find");
        }
        int start = 0 ;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("False");
                break ;
            } else{
                start++;
                end-- ;
            }
        }
        if(start>= end){
            System.out.println("True");
        }
        
       
    }
    
}
