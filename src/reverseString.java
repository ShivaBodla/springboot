import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        String s1 = "shiva";
        String s2 ="";
        for (int i=0;i<s1.length();i++){

            s2=s1.charAt(i)+s2;

        }
        System.out.println(s2);
    }
}
