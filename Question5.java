package Practice.Assignment5;

public class Question5 {
    public static void main(String[] arg){
        String str = "abeQAode" ;
        insert(str);


    }
    public static void insert(String str){
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
        char ch1 = str.charAt(i);
            if(i == 0){
                builder.append(str.charAt(i));
            } else {
                char ch2 = str.charAt(i-1);
                int p = ch1-ch2 ;
                builder.append(p) ;
                builder.append(ch1);
            }
        }
        System.out.print(builder + " ");
    }
    
}
