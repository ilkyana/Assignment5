package Practice.Assignment5;

public class Question6 {
    public static void main(String[] arg){
        String str = "hello" ;
        subsequence(str);

    }
    public static void subsequence(String str){
      
        int start = 0 ;
        while(start < str.length()){
            char ch = str.charAt(start);
          System.out.println(ch);
          
         
            int end = start+1 ;
            while(end < str.length()){
                char ch2 = str.charAt(end);
              System.out.println(ch+ch2);
              
                end++ ;
            }
            start++;
        }
        
    }
    
}
