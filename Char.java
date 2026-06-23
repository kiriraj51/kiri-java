import java.util.*;
class Char {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        char ch =input.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("It is LOERCASE");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("It is UPPERCASE");
        }else if(ch>='0' && ch<='9')
        {
            System.out.println("It is digit");
        }else{
            System.out.println("It is special charcter");
        }
    }
    
}
