package Practice.Assignment5;

public class Question9 {
    public static void main(String[] arg){
        String str = "aaabbbcbbd";
        duplicate(str);

    }
    public static void duplicate(String str){
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            if(i == 0){
                builder.append(str.charAt(i));
            } else if(str.charAt(i) == str.charAt(i-1)){
                continue;
            } else{
                builder.append(str.charAt(i));
            }
        }
        System.out.println(builder);
    }
    
}
