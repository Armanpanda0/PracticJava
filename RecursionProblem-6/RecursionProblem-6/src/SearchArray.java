import java.util.Scanner;

public class SearchArray {

    static void average(int[] arr){
       int n=arr.length;
       int sum=0;
       for (int i=0;i<n;i++){
           sum+=arr[i];
       }
       int avg=sum/n;
        System.out.println("The average of Array "+sum+" is "+avg);

    }
    static void search(int[] arr){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Searching element: ");
        int search=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==search) {
                count++;
            }
        }
        if (count>0){
            System.out.println("Yes "+search+" Is present");
        }
        else
            System.out.println("No "+search+" Is  not present");
    }
    static void large(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The large element is "+max);
    }


    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int[] arr={33,20,30,400,50,60};

      // search(arr);
        //average(arr);
        large(arr);
    }
}
