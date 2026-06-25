import java.util.*;
class Array{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array number:");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}