public class Main {
    static boolean isDivision(int[] a,int m,int maxChoco){
        int numStud=1;
        int choco=0;
        for(int i=0;i<a.length;i++){
            if (a[i] > maxChoco) return false;
            if(choco+a[i]<=maxChoco){
              //numStud++;
              choco+=a[i];
            }else {
                numStud++;
                choco=a[i];
            }
        }
        return numStud<=m;
    }

    static int findMinimaMax(int[] a,int m){
        if(a.length<m) return -1;
        int ans=0,st=0,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivision(a,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={12,34,67,90};
        int m=2;
        System.out.println(findMinimaMax(arr,m));
    }
}