package Practice.Assignment5;

public class Question8 {
    public static void main(String[] args) {
        
    }
    public static void frequency(String str){
        char string[] = str.toCharArray();  
    int freq[] = new int[str.length()];
    char maxchar = str.charAt(0);
        int start = 0 ;
        while(start < str.length()-1){
           freq[start] = 1 ;
           int end = start+1 ;
           while(end < str.length()){
                if(str.charAt(start) == str.charAt(end)){
                    freq[start]++ ;
                }
                end++ ;
           }
           start++; 
        }
        int max = freq[0];
        for(int i = 0 ; i < freq.length ; i++){
            if(max < freq[i]){
                max = freq[i];
                
            }
        }
        
    }
    
}
