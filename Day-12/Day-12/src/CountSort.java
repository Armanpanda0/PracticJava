public class CountSort {

    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    static void basicCount(int[] arr){
        int max=findMax(arr);
        int[] count=new int[max+1];

        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k]=i;
                k++;
            }
        }

    }
    static void counting(int[] arr){
        int n=arr.length;
        int max=findMax(arr);

        for (int i=0;i<n;i++){

        }

    }


    public static void main(String[] args) {
        int[] arr={1,1,3,2,4,11,1,3,7};
        System.out.println("Before Count Sorting");
        display(arr);
        basicCount(arr);
        System.out.println("\nAfter count Sorting");
        display(arr);
    }
}
