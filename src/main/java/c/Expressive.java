package c;
public class Expressive {
    public int expressiveWords(String s,String[] words) {
        String sx = cChar(s);
        int [] scc=cCount(s,sx.length());
        int ans=0;
        for(String word:words){
            boolean t=true;
            String w=cChar(word);
            if(sx.length()!=w.length()) continue;
            if(w.equals(sx)){
                int[] wcc=cCount(word, w.length());
                for(int i=0;i<w.length();i++){
                    if(wcc[i]>scc[i]){
                        t=false;
                        break;
                    }
                    else if((wcc[i]<scc[i]) && scc[i]<3){
                        t=false;
                        break;
                    }
                }
            }
            else t=false;
            if(t) ans++;
        }
        return ans;
    }
    private String cChar(String s) {
        StringBuilder sx = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                sx.append(s.charAt(i));
            }
        }
        sx.append(s.charAt(s.length() - 1));
        return sx.toString();
    }
    private int[] cCount(String s,int l){
        int [] scc=new int[l];
        int count=1;
        for(int i=0,y=0;i<s.length();i++){
            if(i==s.length()-1) {
                scc[y++]=count;
                break;
            }
            if(s.charAt(i)==s.charAt(i+1)) count++;
            else{
                scc[y++]=count;
                count=1;
            }
        }
        return scc;
    }
}
