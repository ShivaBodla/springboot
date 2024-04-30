import java.util.LinkedList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args){
        int m=4;
        List<Integer> v1=new LinkedList<>();
        v1.add(5);
        v1.add(4);
        v1.add(6);
        v1.add(2);
        int n=5;
        List<Integer> v2=new LinkedList<>();
        v2.add(4);
        v2.add(2);
        v2.add(8);
        v2.add(5);
        v2.add(9);
        v2.stream().filter(v1::remove).sorted().distinct().forEach(System.out::println);
        v2.stream().filter(r-> !v1.remove(r)).sorted().distinct().forEach(System.out::println);
        v1.stream().filter(r-> !v2.remove(r)).sorted().distinct().forEach(System.out::println);


    }
}
