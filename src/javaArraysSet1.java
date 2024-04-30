import java.util.Arrays;

public class javaArraysSet1 {
    public static void main(String[] args){
        int n =5;
        int[] arr={1,2,3,4,5};
        int sum=Arrays.stream(arr).sum();
        double avg=Arrays.stream(arr).average().getAsDouble();
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(max);
        System.out.println(min);



    }
}
