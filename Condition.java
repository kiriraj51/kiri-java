import java.util.*;
class Condition {

    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x=input.nextInt();
        if(x<0){
            System.out.println("Number is Negative");
        }else if(x>0){
            System.out.println("Number is postive");
        }else{
            System.out.println("Number is zero");
        }

    }
    
}
