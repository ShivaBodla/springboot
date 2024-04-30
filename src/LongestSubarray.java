import java.lang.reflect.Array;

public class LongestSubarray {
    public static void main(String[] args){
        int k=3;
        int arr[]={2,7,6,1,4,5};
        int n= arr.length;
        System.out.print("Length : "+ LongestSubarrwithsumdivbyk(arr,n,k));
    }

    private static int LongestSubarrwithsumdivbyk(int[] arr, int n, int k) {
        int maxl=0;
        for (int i=0;i<n;i++){
            int sum1=0;
            for (int j=i;j<n;j++){
                sum1+=arr[j];
                if (sum1%k==0){
                    maxl=Math.max(maxl,j-i+1);

                }
            }
        }
        return maxl;
    }
}
