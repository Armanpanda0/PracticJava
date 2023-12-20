import java.util.*;
import java.lang.String;
public class Lexicografical {

    static void frutSleectiom(String[] arr){
        int n=arr.length;

        for (int i=0;i<n-1;i++){
            int min_idx=i;
            for (int j=i+1;j<n;j++){
                if ((arr[j].compareTo(arr[min_idx])) < 0 ) {
                        min_idx=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }

    public static void main(String[] args) {
        String[] arr={"kiwi","mango","Papaya","mango","apple"};
        frutSleectiom(arr);
        for (String val:arr){
            System.out.print(val+" ");
        }
    }
}
