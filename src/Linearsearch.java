import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Linearsearch {
    public static void main(String[] args){
        int[] a={25,66,63,5,233,25,3,5,63,56,3633,787};
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

        String s="shiva krishna";
        String b=s.replace(" ","");
        String[] f=b.split("");
        Map<Object, Long> r= Arrays.stream(f).collect(Collectors.groupingBy(e-> e, LinkedHashMap::new, Collectors.counting()));
        System.out.println(Arrays.toString(f));
        System.out.println("r: "+r);
        Arrays.stream(f).sorted((e,e1)->e1.compareTo(e)).findFirst();

        Optional<Map.Entry<Object, Long>> c= r.entrySet().stream().filter(e->e.getValue()==1).findFirst();
        System.out.println("c: "+c);

        for (int i=0;i<s.length();i++){
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.println(s.charAt(i));
                break;
            }
        }



    }
}
