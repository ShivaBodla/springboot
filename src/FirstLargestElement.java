import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FirstLargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter  values::");

        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int largest=a[0];
        for (int i=1; i<a.length;i++){
            if (largest<a[i]){
                largest=a[i];
            }
        }

        System.out.println("largest element is :"+ largest);

        int[] b={2,65,89,222,3,555,87,621,10,44};
      //  int[] c={};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.stream(b).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst());
//        for (int j=0;j<b.length;j++){
//            S
//        }
    }
}
