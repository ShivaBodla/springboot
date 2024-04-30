import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistAndItaretor {
    public static void main(String[] args){
        List<Integer> num1= new ArrayList<>();
        num1.add(12);
        num1.add(65);
        num1.add(89);
        List<Integer> num2= new ArrayList<>();
        num2.add(33);
        num2.add(56);
        num2.add(7);

        System.out.println(num1);
        System.out.println(num2);
        num2.addAll(num1);
        num2.add(2,88);
        num2.remove(2);
        System.out.println(num2);

        Iterator<Integer>  sh= num2.iterator();

        while (sh.hasNext()){

            System.out.println(sh.next());
        }

        ListIterator<Integer> f=num2.listIterator();

        while (f.hasNext()){
            System.out.println(f.next());
        }




    }
}
