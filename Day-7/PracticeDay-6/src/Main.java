//BubbleSort
public class Main {
    static void bubble(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
          //  System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[]={7,5,3,1};
        bubble(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}