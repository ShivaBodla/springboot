import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Greterthan5 {
    public static void main(String[] args){
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(30);
        list.add(84);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(89);
        list.add(777);
        list.add(89);
       list.stream().filter(e-> e>5).sorted().distinct().forEach(e->System.out.println(e));
        list.stream().filter(e-> e>5).sorted((e,e1)-> e1.compareTo(e)).forEach(e->System.out.println(e));

        //3rd largest number
        int[] a={25,66,63,5,233,25,3,5,63,56,3633,787};
        Integer b= Arrays.stream(a).boxed().sorted((e, e1)-> e1.compareTo(e)).skip(2).findFirst().get();
        System.out.println(b);
        //2nd lowest
        Integer c= Arrays.stream(a).boxed().sorted().skip(1).findFirst().get();
        System.out.println(c);
        //largest string
        List<String>  s=Arrays.asList("shiva","Ashwanth","Akshaye","Sankar");
        s.stream().sorted((e,e1)->e1.length()-e.length()).forEach(e->System.out.println(e));
        //for each loop
        for(String sr:s){
            System.out.println(sr);
        }
        //linear search
        int j=3;
              //using stream
        Arrays.stream(a).filter(e-> e==j).forEach(e->System.out.println(e));
              // using forloop
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==j){
                count+=1;
                System.out.println(a[i]+" index "+i);
                break;
            }
        }
        if (count==0) {
            System.out.println("There is no such integer in that Array");
        }

        //1234-->2468

        int [] y={1,2,3,4};
        Arrays.stream(y).map(e->e*2).forEach(e-> System.out.print(e+" "));

        //Shiva, Krishna, Rajesh, raju, Rahim. ->. Print names whose Length is greater than 6

        List<String> m=new ArrayList<>();
        m.add("shiva");
        m.add("krishna");
        m.add("rajesh");
        m.add("raju");
        m.add("rahim");

        m.stream().filter(e->e.length()>6).forEach(e-> System.out.println(e.toUpperCase()));
        m.stream().sorted((e,e1)-> e1.length()-e.length()).forEach(e-> System.out.println(e));

        String w= m.stream().sorted((e,e1)-> e1.length()-e.length()).skip(1).findFirst().get();
        System.out.println(w);



        IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7}).filter((int i) -> i > 5).distinct().forEach(System.out::println);

        System.out.println("    ");
        //Print not divisible by 2

        List<Integer> numbers = Arrays.asList(8, 2, 5, 7, 3, 6);


        numbers.stream().filter(e->(e%2)!=0).forEach(e-> System.out.println(e));




        //pallendrom
        

        //no.of times repeting letter
    }
}
