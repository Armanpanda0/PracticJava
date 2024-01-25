import java.lang.reflect.Array;
import java.util.Arrays;

public class mcq{
    public static void main(String[] args) {
        int[] arr={1,2,3,42};
        int tag=42;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
                if (arr[i]!=tag){
                    count++;
                }
        }

        for (int val:arr){
            System.out.print(val+" ");
        }
        System.out.println("\n"+count);
    }
}
