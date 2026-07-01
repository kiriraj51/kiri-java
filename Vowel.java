public class Vowel {
    public static void main(String[] args) {
        String s="Education";
        int n=s.length();
        s=s.toUpperCase();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.println("Total No.of vowels is: "+count);
    }    
}
