public class Count {
    public static void main(String [] args){
        String s="the sky is blue";
        String[] words=s.split();
        int n=words.length;
        for(int i=n-1;i>=0;i--){
            System.out.println(words[i]);
        }
    }
    
}
