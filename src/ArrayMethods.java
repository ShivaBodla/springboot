import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMethods {
    public static void main(String[] args){
        int [] a={3,5,3,2,8,0,4};
        int [] a1={4,0,8,2,3,5,3};
        int z=Arrays.binarySearch(a,5);
        boolean v=Arrays.equals(a,a1);
        System.out.println(v);

        Arrays.sort(a);
        System.out.println("a:"+Arrays.toString(a));
        List<Integer> integers = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(integers);
        System.out.println(integers.stream().findFirst());
        System.out.println(integers.stream().skip(2).findFirst());
        integers.stream().limit(integers.size()/2).forEach(System.out::println);
        System.out.println(integers.stream().skip(2).findFirst());


    }
}
