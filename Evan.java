import java.util.*;
class Evan{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int[] arr=new int[4];
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count=count+1;
            }
        }
        System.out.print(count);
    }
}