import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args){
       /* Scanner sc= new Scanner(System.in);
        System.out.println("Enter size:");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter  values::");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int first=a[0];
        int second=0;
        for (int i=0 ; i<a.length;i++){
            if(first<a[i]) {
                second = first;
                first = a[i];
            }
            else if (a[i]>second&& first!=a[i]){
                second=a[i];

            }
        }
        System.out.println(second);*/

        int [] b={21,56,55,5,125,3321,453,124};
        Arrays.sort(b);
        System.out.println(Arrays.stream(b).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst());
       /* for (int j=0;j<b.length;j++){

        }*/
    }
}
