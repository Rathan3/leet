package c;
public class Expressive {
    public int expressiveWords(String s,String[] words) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(!(s.charAt(i)==s.charAt(i+1))) count++;
        }
        if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)) count++;
        System.out.println(count);
        int[] len=new int[s.length()*2];
        s=charCount(s);
        System.out.println(s);
        for(String word:words){
            word=charCount(word);
            System.out.println(word);
        }
        /*
         * int[] cca=new int[s.length()];
         * 
         * 
         */
        
        return 0;
    }
    private String charCount(String s){
        String sx="";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1) {
                sx=sx+s.charAt(i)+count;
                break;
            }
            if(s.charAt(i)==s.charAt(i+1)) count++;
            else{
                sx=sx+s.charAt(i)+count;
                count=1;
            }
        }
        return sx;
    }
}
