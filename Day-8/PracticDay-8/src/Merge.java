public class Merge {
    static void mergeS(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-i-1;j++){

                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag){
                return;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={7,7,6,1,2};
        mergeS(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
