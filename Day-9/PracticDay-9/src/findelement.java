import java.util.Scanner;

public class findelement {


    static void smallelement1(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=0;j<n;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        smallelement1(arr);
       for (int val:arr){
           System.out.print(val+" ");
       }
    }
}
