import java.util.*;
class Bill {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int b=input.nextInt();
        if(b<=100){
            System.out.println(b*2);
        }
        else if(b>100 && b<=200){
            System.out.println(200+(b-100)*3);
        }
        else{
            System.out.println(500+(b-200)*5);
        }
    }
    
}
