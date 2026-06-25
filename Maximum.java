import java.util.*;
class Maximum{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int[] arr=new int[4];
        int max=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}