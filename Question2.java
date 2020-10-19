package Practice.Assignment5;

public class Question2 {
    public static void main(String[] arg){
        String str = "abcdecba";
        System.out.println(countPali(str));

    }
    public static int countPali(String str){
        int start = 0 ;
        int end = str.length()-1;
        int count = 0 ;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                count++ ;
            }
            start++;
            end-- ;
        }
            return count ;
    }
    
}
