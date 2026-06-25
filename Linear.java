import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }    
        int target=input.nextInt();
        boolean isfound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                isfound=true;
            }
        }
        System.out.println(isfound);
    }
}
