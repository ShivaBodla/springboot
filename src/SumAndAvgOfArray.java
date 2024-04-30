public class SumAndAvgOfArray {
    public static void main(String[] args){
        int [] p={9,6,3,2,5,8,7,4,1};
        int sum=0;
        int avg=0;
        for(int i=0;i<p.length;i++){
            sum+=p[i];

        }
        System.out.println(sum);
        for(int i=0;i<p.length;i++){
            avg=(sum+p[i])/p.length;
        }
        System.out.println(avg);
    }
}
