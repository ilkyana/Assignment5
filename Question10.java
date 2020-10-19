package Practice.Assignment5;

public class Question10 {
    public static void main(String[] arg){
        String str ="aaabbccds";
        count(str);


    }
    public static void count(String str){
        StringBuilder builder = new StringBuilder() ;
        int count = 1 ;
        for(int i = 0 ; i< str.length() ; i++){
           
            if(i == 0){
                builder.append(str.charAt(i));
            
            } else if(str.charAt(i) == str.charAt(i-1)){
               
                count++ ;

                } else{
              
                if(count >1){
                    builder.append(count);
                }
                count = 1 ;
                
                builder.append(str.charAt(i));

                 }

        }
        System.out.println(builder);
    }
    
}
