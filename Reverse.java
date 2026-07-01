public class Reverse {
    public static String ReverseWord(String str){
        String[] words=str.split(" ");
        int n=words.length;
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        return sb.toString();
    }
    public static void main(String [] args){
        String s="the sky is blue";
        System.out.println(ReverseWord(s));
        
    }
}
