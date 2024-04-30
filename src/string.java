import java.util.Arrays;
import java.util.stream.Collectors;

public class string {
    public static void main(String[] args)
    {
        String a="shiva";
        a.chars();
        System.out.println(a.chars().max());//maximum value in charecter
        System.out.println(a.chars().sum());// sum of cherecters
        System.out.println(a.chars().allMatch(e->e>118));//need to satisfy all char in conditions
        System.out.println (Arrays.toString(a.chars().toArray()));//
        System.out.println(a.chars().anyMatch(e->e>108));
        System.out.println(a.chars().noneMatch(e->e>118));
        System.out.println(Arrays.toString(a.chars().asDoubleStream().toArray()));
        System.out.println(Arrays.toString(a.chars().asLongStream().toArray()));
        System.out.println(a.chars().average());
        System.out.println(a.chars().boxed().count());
        System.out.println(a.chars().boxed().distinct().collect(Collectors.toList()));
        System.out.println(a.chars().boxed().findAny());
        System.out.println(a.chars().boxed().findFirst());
        System.out.println(a.chars().boxed().sorted());



    }
}
