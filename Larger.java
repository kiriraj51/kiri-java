import java.util.*;
class Larger{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        if(x>y && x>z){
            System.out.println(x+" is largest");
        }else if(y>z){
            System.out.println(y+" is largest");
        }else{
            System.out.println(z+" is largest");
        }
    }
    
}
