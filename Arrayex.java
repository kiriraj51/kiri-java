import java.util.*;
class Arrayex{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array number:");
        int n=input.nextInt();
        int[] arr=new int[n];
        int a=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            a+=arr[i];
        }
        System.out.println("the sum "+a);
    }
}