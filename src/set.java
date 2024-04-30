import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args){

        //set doesn't allow duplicate elements

        System.out.println("hash_Set");
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("BSP");
        hash_Set.add("ASHWANTH");
        hash_Set.add("RASALEELA");
        hash_Set.add("DEBBA");
        hash_Set.add("BSP");

        Set<Integer> A = new HashSet<Integer>();
        A.add(123);
        A.add(24);
        A.add(2356);
        A.add(123);

        System.out.println(A);
        System.out.println(hash_Set);
        System.out.println("Tree_Set");
        Set<String> Tree_Set = new TreeSet<String>();
        Tree_Set.add("BSP");
        Tree_Set.add("ASHWANTH");
        Tree_Set.add("RASALEELA");
        Tree_Set.add("DEBBA");
        Tree_Set.add("BSP");

        Set<Integer> AB = new TreeSet<Integer>();
        AB.add(123);
        AB.add(24);
        AB.add(2356);
        AB.add(123);
        System.out.println(AB);
        System.out.println(Tree_Set);
        System.out.println("Linked Hash set");

        Set<String> Linked_hash_Set = new LinkedHashSet<String>();
        Linked_hash_Set.add("BSP");
        Linked_hash_Set.add("ASHWANTH");
        Linked_hash_Set.add("RASALEELA");
        Linked_hash_Set.add("DEBBA");
        Linked_hash_Set.add("BSP");

        Set<Integer> B = new LinkedHashSet<Integer>();
        B.add(123);
        B.add(24);
        B.add(2356);
        B.add(123);
        System.out.println(B);
        System.out.println(Linked_hash_Set);

    }
}
