import java.text.DecimalFormat;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        float a= 5.43F;
        float b=2.653F;
        double c=a/b;
        float d=a/b;
        DecimalFormat ABC=new DecimalFormat("0.000");

        System.out.println("float :"+Math.round(c)+ "  "+ ABC.format(d));
        System.out.print("Hello World");
        System.out.println("Hello World");
        System.out.println("Greeks\nfor\nGreeks");

        String s= "BSP";
        System.out.println("lower case : "+s.toLowerCase());

        int m=8;
        int n=4;
         if (m>n){
             System.out.println("m is greater than n");
         }
         else {
             System.out.println("n is greater than m");
         }

         String p="Shiva";
         String f="";
         for (int i=0;i<p.length();i++){
             f=p.charAt(i)+f;
         }
         System.out.println(f);

         int q=1;
         float w=2F;
         double e=3;
         long r=5;
         byte t=127;

         System.out.println(e/w);
        System.out.println(w/q);
        System.out.println(e/q);
        System.out.println((e/w)+r);
        System.out.println(q/r);





        /* boolean z=m>n;//in switch boolean will not be taken as a condition
        switch (z){
            case true: System.out.println(" greater");
            break;
            case false: System.out.println("lesser");
            break;
        }



      /*  Scanner sc= new Scanner(System.in);
        System.out.println("enter the values8");
        int t=sc.nextInt();
        while (t-- >0) {
            int A = sc.nextInt();
            float B = sc.nextFloat();
            long C = sc.nextLong();
            byte D = sc.nextByte();
            System.out.println("int " + A);
            System.out.println("flot " + B);
            System.out.println("long " + C);
            System.out.println("byte " + D);
            sc.nextLine();
            String S = sc.nextLine();
            System.out.println("string " + S);
            sc.close();
        }*/



    }
}
