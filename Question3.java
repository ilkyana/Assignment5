package Practice.Assignment5;

public class Question3 {
    public static void main(String[] arg){
        String str = "swati";
        toggle(str);
       

    }
    public static void toggle(String str){
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            } else{
                ch = (char) (ch + 32);
            }
            builder.append(ch) ;
        }
        System.out.println(builder);
       
    }
    
}
