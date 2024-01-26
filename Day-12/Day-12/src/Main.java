public class Main {


    static void swap(int[] arr,int st,int en){
        int temp=arr[st];
        arr[st]=arr[en];
        arr[en]=temp;
    }

    static void display(int[] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }

    static int partition(int[] arr,int st,int en){
        int pivInd=arr[st];
        int count=0;
        for (int i=st+1;i<=en;i++){
            if (arr[i]<=pivInd){
                count++;
            }
        }
        int povtIndx=st+count;
        swap(arr,st,povtIndx);
        int i=st,j=en;
        while (i<povtIndx && j> povtIndx){
            while (arr[i]<=pivInd) i++;
            while (arr[j]>pivInd) j--;
            if (i<povtIndx && j> povtIndx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return povtIndx;
    }
    static void quicksort(int arr[] ,int st,int en){
        if (st>=en) return;
        int pivot=partition(arr,st,en);
        quicksort(arr,st,pivot-1);
        quicksort(arr,pivot+1,en);
    }


    public static void main(String[] args) {

        int[] arr={6,4,11,3,33};
        int n=arr.length;
        System.out.println("Before Sorting: ");
        display(arr);
        System.out.println("\nAfter Sorting:");
        quicksort(arr,0,n-1);
        display(arr);
    }
}