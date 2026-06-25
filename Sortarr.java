import java.util.*;
public class Sortarr {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
