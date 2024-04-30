import java.util.Arrays;

public class ThirdlargestElement {
    public static void main(String[] args ){
        int[] a={25,66,63,5,233,25,3,5,63,56,3633,787};
       Integer b= Arrays.stream(a).boxed().sorted((e, e1)-> e1.compareTo(e)).skip(2).findFirst().get();
       System.out.println(b);
    }
}
