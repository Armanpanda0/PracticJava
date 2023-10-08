import java.util.ArrayList;

public class reversrArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        //int[] arr1={ };
       // ArrayList<Object> arr1=new ArrayList<Object>();
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println("Length of the Array is: "+count);
        System.out.println("Length of the array is: "+arr.length);
      //  System.out.println(arr1);
    }
}
