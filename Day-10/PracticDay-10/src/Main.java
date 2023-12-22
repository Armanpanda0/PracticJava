import java.util.Scanner;


public class Main {
    static void sortArray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Array size: ");
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int[] arr=new int[e];
        for (int i=0;i<e;i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr);
        double f=Math.round(e/2);
       // System.out.println(f);
        //double d=Math.floor(e/2);
       // System.out.println(d);
        for (int i=0;i<arr.length;i++){
            if (arr[i]>(f+1)){
                System.out.print(arr[i]+" ");
            }
        }
    }
}